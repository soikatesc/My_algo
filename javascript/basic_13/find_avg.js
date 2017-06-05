function findMax(arr){
	var sum = 0

	for( var i = 0; i<arr.length; i++){
		sum = sum + arr[i]
	}

	return sum/arr.length
}

console.log('avg: ', findMax([2,100,4]))