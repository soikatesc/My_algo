#very slow
# Using memorization
from functools import lru_cache

def fibonacci(n):
	if n == 1:
		return 1
	if n == 2:
		return 1
	if n > 2:
		return fibonacci(n-1) + fibonacci(n-2)

fibonacci_cache = {}
def fibonaccim(n):
	# If we have cached the value, the return it 
	if n in fibonacci_cache:
		return fibonacci_cache[n]
	if n == 1:
		return 1
	elif n == 2:
		return 1
	elif n > 2:
		value = fibonaccim(n-1) + fibonaccim(n-2)
	fibonacci_cache[n] = value
	return value

# Using lru cache
@lru_cache(maxsize = 1000)
def fibonacci_lru(n):
	if type(n) != int:
		raise TypeError("n must be a positive int")
	if n < 1:
		raise ValueError("n must be a positive int")
	if n == 1:
		return 1
	if n == 2:
		return 1
	if n > 2:
		return fibonacci_lru(n-1) + fibonacci_lru(n-2)

for n in range(1, 51):
	print(n , ":", fibonacci_lru(n))

