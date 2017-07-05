let addNumbers = (a, b, c) => {
	console.log(a+b+c)
}

let nums = [3, 4, 5]
addNumbers(...nums)

let computers = ['Mac', 'Windows'];
let food = ['apples', ...computers, 'kiwi', 'rice'];
console.log(food)