
//reversing a string
function ReverseStr(str){
	nestr = ""
	for(var i=str.length-1; i>=0; i--){
		console.log(str[i])
		nestr += str[i]
	}
	console.log(nestr)
}


str = "creature";
ReverseStr(str)
