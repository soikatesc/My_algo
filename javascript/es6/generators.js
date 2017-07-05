// generator function
//Can have differnt checkpoint and pause

function* simpleGenerator(){
	yield 'apples';
	yield 'fish';
	console.log('ok, this is line after fish')
	yield 'corn';
}



let sample = simpleGenerator();
console.log(sample.next().value);
console.log(sample.next().value);
console.log(sample.next().value);
console.log(sample.next().value);

console.log('-----------------')

function* getNextId(){
	let id = 0;
	while(id<3){
		yield id++;
	}
}

let createUser = getNextId()
console.log(createUser.next())
console.log(createUser.next())
console.log(createUser.next())