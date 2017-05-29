function reverseInt(n){
	//base case
	if(n < 1){
		return n
	}
	console.log('num -> ', n)
	return reverseInt(n-1)
}

//1st solution
function printUp(count, n){
	if(count > n){
		return n
	}

	console.log('num -> ', count)
	return printUp(count+1, n)
}

// console.log('Prin down: ')
// reverseInt(10)
console.log('Print Up: ')
printUp(1, 10)