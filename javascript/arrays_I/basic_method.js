//declaring a new array
var myArr = []
console.log(myArr.length)

//Setting and accessing array values:
myArr[0] = 42
console.log(myArr[0])

//Array.length is determinde by largest index:
myArr[1] = "hi"
myArr[2] = true
console.log(myArr.length)

//Array can be sparsely pupulated:
myArr[myArr.length+1] = 2
console.log(myArr.length)
//[42, 'hi', true, undefined, 2]

//overwritting array values
myArr[0] = 101;
myArr[3] = "MG"

//shorten array with pip(), length then with push()
myArr.pop()
console.log(myArr.length)
myArr.push("dat")
console.log(myArr.length)