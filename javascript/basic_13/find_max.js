function findMax(arr){
	var max = arr[0]

	for( var i = 0; i<arr.length; i++){
		if( max < arr[i]){
			max = arr[i]
		}
	}

	return max
}

console.log('max: ', findMax([2,100,4]))