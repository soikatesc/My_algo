function rTrib(num){
	if(num <= 0 || num == 1){
		return num
	}else{
		console.log(num)
		return rTrib(num - 1) + rTrib(num - 2) + rTrib(num - 3)
	}
}	

console.log('num', rTrib(6))