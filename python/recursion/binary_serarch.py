def binarySearch(arr, key):
	size = len(arr)
	low = 0;
	high = size-1

	while low <= high:
		middle = int((low + high)/2)
		

		if key == arr[middle]:
			return True
		elif key < arr[middle]:
			high = middle - 1
		elif key > arr[middle]:
			low = middle + 1
	return False
print(binarySearch([1, 2, 3, 4], 2))

