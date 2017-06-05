function oddNums(arr){
	var newArr=[]

	for( var i = 0; i<arr.length; i++){
		if(arr[i] % 2 != 0){
			newArr.push(arr[i])
		}
	}

	return newArr
}

console.log('odd: ', oddNums([2,100,4, 5, 7]))