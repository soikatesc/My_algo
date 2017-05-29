function printPattern(n){

	if(n<1){
		return n
	}
	// console.log(' '.repeat(n))
	console.log('*'.repeat(n))
	return printPattern(n-1)
}

function printPattern2(count, n){
	if(n<1){
		return n
	}
	console.log('*'.repeat(count))
	return printPattern2(count+1, n-1)
}

function printPattern3(count, n){
	if(n<1){
		return n
	}
	console.log(' '.repeat(count-1) + '*'.repeat(n))
	return printPattern3(count+1, n-1)
}

function printPattern4(count, n){
	if(n<1){
		return n
	}
	console.log(' '.repeat(n-1) + '*'.repeat(count))
	return printPattern4(count+1, n-1)
}


function printPattern5(count, n){
	if(n<1){
		return n
	}
	console.log(' '.repeat(n-1) + '*'.repeat(count+count-1))
	return printPattern5(count+1, n-1)
}

function printPattern6(count, n){
	if(n<1){
		return n
	}
	console.log(' '.repeat(count-1) + '*'.repeat(n+n-1))
	return printPattern6(count+1, n-1)
}

// function printPattern7(count, n){
// 	if(n<1){
// 		return n
// 	}
// 	// console.log(' '.repeat(n))
// 	console.log('*'.repeat(n)+' '.repeat()+'*'.repeat(n))
// 	return printPattern7(count+1, n-1)
// }


printPattern(15)
printPattern2(1, 15)
printPattern3(1,15)
printPattern4(1,15)
printPattern5(1,15)
printPattern6(1,15)
// printPattern7(1, 5)


