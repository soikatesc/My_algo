function removeEvenLength(str_arr){
	var new_str_arr = []
	for( var i=0; i<str_arr.length;i++){
		if((str_arr[i].length % 2) != 0){
			new_str_arr.push(str_arr[i])
		}
	}
	console.log(new_str_arr)
	return new_str_arr;

}


var str_arr=['Nope!', 'Its', '.', 'starting', 'K!']  
removeEvenLength(str_arr)