function balancePoint(arr) {

	var leftSum = 0;
	var rightSum = 0;

	for(var i=0; i<arr.length-1; i++) {
		leftSum += arr[i];

		for(var j=i+1; j<arr.length; j++) {
			rightSum += arr[j];
		}
		if(leftSum == rightSum) {
			return true;
		}
		rightSum = 0;
	}
	return false;
}	

var arr1 = [1,2,3,4,10];
var arr2 = [1,2,4,2,1];
var arr3 = [-2, -3, 1];
console.log(balancePoint(arr3))