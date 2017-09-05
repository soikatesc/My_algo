import itertools

my_list = ['a','b','c']

combinations = itertools.combinations(my_list, 3)
for c in combinations:
	print(c)

# permutations = itertools.permutations(my_list, 3)
# for p in permutations:
# 	print(p)