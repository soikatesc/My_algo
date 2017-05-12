
str = "Live from New York, it's Saturday Night!"
str_split = str.split(" ")
console.log(str_split)

acronyme = ""
for(var i=0; i<str_split.length;i++){
	acronyme += str_split[i][0].toUpperCase()
}

console.log(acronyme)