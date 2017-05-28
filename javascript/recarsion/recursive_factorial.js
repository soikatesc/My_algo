function recursiveFact(num){
	if(num <= 0){
		return 1
	}
	console.log(Math.trunc(num))
	return recursiveFact(Math.trunc(num) - 1) * Math.trunc(num)
}

console.log('sum: ', recursiveFact(6.5))
