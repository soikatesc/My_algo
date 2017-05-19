
function sum(){
	var args = Array.from(arguments)
	console.log(args)
	var first = args[0]
	var second = args[1]
	if(args.length === 2){
		return first+second;
	}
	return first + sum.apply(null, args.slice(1))
}
var result = sum(1,2,3,4)
console.log(result)