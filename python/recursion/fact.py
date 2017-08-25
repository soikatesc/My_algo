def fact(n):
	if n <= 0:
		return 1
	else:
		val = n*fact(n-1)
		# print(val)
		return val

print(fact(10))