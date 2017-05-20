function sum_even_num(start, end){
	var sum = 0;
	for(var i=start; i<=end; i++){
		if(i%2 == 0){
			sum = sum + i;
		}
	}
	console.log(sum)
}

var start = 1;
var end = 255;
sum_even_num(start, end)