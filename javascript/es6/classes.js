class Person{
	constructor(name, age, weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	displayName(){
		console.log(this.name)
	}

	displayAge(){
		console.log(this.age)
	}

	displayWeight(){
		console.log(this.weight)
	}

	// let displayWeight = (x) => console.log(15)
}

// Parant is the super class
//programmer is the child class

class Programmer extends Person {
	constructor(name, age, weight, language){
		super(name, age, weight)
		this.language = language
	}

	displayLanguage(){
		console.log(this.language)
	}
}

let soikat = new Person('Soikat', 27, '130lb')
soikat.displayWeight()
soikat.displayName()
soikat.displayAge()

//onle programmer has access for displayLanguage function
md = new Programmer('Md', 27, '130lb', 'javascript')
md.displayWeight()
md.displayName()
md.displayAge()
md.displayLanguage()



