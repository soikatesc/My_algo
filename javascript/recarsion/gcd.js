function gcf(x, y){
	if(x < y){
		var temp = x
		x = y
		y = temp
	}
	if( y == 0){
		return x
	}
	// console.log(x, y)
	return gcf(y, x%y)
}

console.log(gcf(3, 0))