import math
def factors(n):
	factors = []
	for i in range(1,int(math.sqrt(n)+1)):
		if n%i == 0 :
			factors.append(i)
			if i != int(math.sqrt(n)):
				factors.append(n/i)
	factors.sort()
	result = list(map(int,factors))
	return result

number = int(input('Enter a number: '))
print(factors(number))



