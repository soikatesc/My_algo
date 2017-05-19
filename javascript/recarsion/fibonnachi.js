var readline = require('readline')

function fib_series(small, large, n){
	var sum;

	if(n<=0){
		return n;
	}
	sum = small + large
	console.log(sum)
	fib_series(large,sum,n-1)
}

var n=3
console.log(fib_series(-1,1,n))
