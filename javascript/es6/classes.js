class Person{
	constructor(name, age, weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	displayWeight(){
		console.log(this.weight)
	}
}

let soikat = new Person('Soikat', 27, '130lb')
soikat.displayWeight()