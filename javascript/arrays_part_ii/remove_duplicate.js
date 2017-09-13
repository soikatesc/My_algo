function removeDuplicate(arr){

	var newArr = [];

	for(var i=0; i<arr.length; i++) {
		if(newArr.includes(arr[i]) != true){
			newArr.push(arr[i]);
		}
	}
	return newArr;
}

// console.log(["Sam", "Great", "Sample", "High"].includes("Sam"))

console.log(removeDuplicate([1, 2, 1, 3, 4, 2]));