import math

def PrimeFactorization(n):
	for i in range(2, n):
		if n%i == 0:
			