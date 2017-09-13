function MergeSort(arr, left, right){

	if(left == right){
		return arr[left]
	}

	size = right-left+1
	left1 = left
	right1 = (size/2)-1 + left1
	left2 = right1+1
	right2 = right
	console.log(arr)
	MergeSort(arr, left1, right1)
	console.log(size)
	// console.log(right1)
}

function Mearge(){
	
}

arr = [2,7, 9, 10, 0, 5]
// arr =[1]
MergeSort(arr, 0, arr.length-1)


