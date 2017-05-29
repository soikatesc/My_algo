function add_num(n){
	if(n<1){
		return n
	}
	return n + add_num(n-1)
}

console.log(add_num(10))