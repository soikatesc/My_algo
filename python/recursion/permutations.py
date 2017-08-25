def permutations(word):
	if len(word) == 1:
		return [word]
	else:
		# get all permutations
		perms = permutations(word[1:])
		char=word[0]
		result=[]
		for perm in perms:
			for i in range(len(perm) + 1):
				p = perm[:i]+char+perm[i:]
				if p not in result:
					result.append(p)
		return result

print(permutations('abc'))

