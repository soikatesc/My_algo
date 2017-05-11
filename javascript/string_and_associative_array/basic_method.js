
var funStr = "Emma shreds on her electric cello";
console.log('Type is: ',typeof funStr)  //string

var oneChar = funStr[26]
console.log('Type is:', typeof oneChar)

console.log(funStr.length)
console.log("".length)

//string split

wordArray = funStr.split(" ")
console.log(wordArray)

console.log(wordArray[5].split(""))

//Array.join(convert array to string using provided parameter as separator)
console.log(wordArray.join())
console.log(wordArray.join("-"))
console.log(wordArray.join(""))

console.log(1+2+"3"+"4"+5+6)