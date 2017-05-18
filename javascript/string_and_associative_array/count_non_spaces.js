
function countNonSpace(str){
	str_split = str.split("")
	var count = 0;
	for(var i=0; i < str.length; i++){
		if(str[i] != " "){
			count++;
		}
	}
	return count;
}

str = "Honey pie, you are driving me crazy"
console.log(countNonSpace(str))2
