function circleArea1(r){
	var PI = 3.1416;
	return PI*r*r
}

//new way to write function
// let functionname = (arguments) => {}
//should reduce using var keyword
let circleArea2 = (r) => {
	const PI = 3.14;
	return PI*r*r;
}

//One parameter dosen't need to include paranthesis
//returing a code dosen't need to multiple statement
let circleArea3 = r => 3.14 * r * r

console.log(circleArea1(7))
console.log(circleArea2(7))
console.log(circleArea3(7))