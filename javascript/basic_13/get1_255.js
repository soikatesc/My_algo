function rangeNumber(start, end){
	var arr = []

	for(var i=start; i<=end; i++){
		arr.push(i)
	}
	console.log(arr)
}

var start = 1;
var end = 255;
rangeNumber(start, end)