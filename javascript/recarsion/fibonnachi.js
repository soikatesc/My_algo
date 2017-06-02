

function fib_series(small, large, n){
	var sum;

	if(n<=0){
		return n;
	}
	sum = small + large
	console.log(sum)
	fib_series(large,sum,n-1)
}

// var n=3
// console.log(fib_series(-1,1,n))

function rFib(num){
	sum = 0
	if(num <= 0 || num == 1){
		return num
	}else{
		console.log(num)
		return rFib(num - 1) + rFib(num - 2)
	}
}

//fibonacchi series fast
function fib_term_fast(small, large, n){
	if(n == -1){
		return large
	}
	sum = small + large
	console.log('sum -> ', sum)
	return fib_term_fast(large, sum, n-1)
}
console.log(fib_term_fast(-1, 1, 10))

