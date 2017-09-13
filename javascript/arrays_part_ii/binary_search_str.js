function binarySearch(str, key) {

	arrStrAscii = [];
	keyAscii = key.charCodeAt(0);

	for(var i=0; i<str.length; i++) {
		var charCode = str[i].charCodeAt();
		arrStrAscii.push(charCode);
	}

	var result = binarySearch(arrStrAscii, 0, arrStrAscii.length, keyAscii);
	console.log(result);

	function binarySearch(A, low, high, x) {
		if(low > high){
			return -1;
		}
		mid = Math.trunc(low + (high-low)/2);
		if(x == A[mid]) {
			return A[mid];
		}else if(x < A[mid]) {
			return binarySearch(A, low, mid-1, x);
		}else{
			return binarySearch(A, mid+1, high, x);
		}
	}
}

binarySearch(" &-0579DEFXZ[abcz|", "c")