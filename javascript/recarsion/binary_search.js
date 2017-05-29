function binarySearch(A, low, high, x){
	if(low > high){
		return -1
	}
	mid = Math.trunc(low + (high-low)/2)
	console.log('mid ->', mid)
	if (x == A[mid]){
		return A[mid]
	}
	else if(x < A[mid]){
		return binarySearch(A, low, mid-1, x)
	}
	else{
		return binarySearch(A, mid+1, high, x)
	}


}

var A = [2,6,13,21,36,47,63,81]
console.log(binarySearch(A, 0, 8, 100))


