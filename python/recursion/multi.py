def multi(x, y):
	if y == 0:
		return 0
	if y < 0:
		return -x + multi(x, y+1)
	else:
		return x + multi(x, y-1)

print(multi(2,-50))