function balanceIndex(arr) {

	var leftSum = 0;
	var rightSum = 0;
	var bp = 0;

	if(arr.length <= 2) {
		return -1;
	}else{
		for(var i=0; i<arr.length-1; i++) {
			bp = i+1;
			for(var j = 0; j<bp; j++){
				leftSum += arr[j];
			}
			for(var k=bp+1; k<arr.length; k++) {
				rightSum += arr[k];
			}

			if(leftSum == rightSum) {
				console.log(`Balance index value: ${arr[bp]}`)
				return bp;
			}else{
				leftSum = 0;
				rightSum = 0;
			}
		}
	}
	return -1;
}

var arr1 = [9, 9];
var arr2 = [-2, 5, 7, 0, 3];
console.log("Balance index: " + balanceIndex(arr2));