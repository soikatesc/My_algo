
str = "0s1a3y5w7h9a2t4?60"
split_str = str.split("")
//method1 using regex
split_str = str.replace(/[^0-9]/g,'')
console.log(split_str)

//method 2 using parseint method
newarr = []
for(var i=0; i<split_str.length;i++){
	if(Number.isInteger(parseInt(split_str[i]))== true){
		console.log(parseInt(split_str[i]))
		newarr.push(split_str[i])
	}
}
join_num = newarr.join("")
join_num_int = parseInt(join_num)

console.log(newarr)
console.log(join_num)
console.log(typeof(join_num_int))