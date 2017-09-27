function Queue() {
	this.dataStore = [];
	this.enqueue = enqueue;
	this.dequeue = dequeue;
	this.front = front;
	this.back = back;
	this.empty = empty;
	this.toString = toString;
}

function enqueue(element) {
	this.dataStore.push(element)
}

function dequeue() {
	this.dataStore.shift()
}

function front(){
	return this.dataStore[0]
}

function back(){
	return this.dataStore[this.dataStore.length-1]
}

function empty(){
	if(this.dataStore.length == 0) {
		return true
	}else{
		return false
	}
}

function toString(){
	var retStr = ""

	for(var i=0; i<this.dataStore.length-1;i++){
		retStr = this.dataStore[i] + "\n";
	}
	return retStr;
}



var q = new Queue()
q.enqueue("Md")
q.enqueue("Rahaman")
q.enqueue("Priam")
q.enqueue("Alpha")
console.log(q)
// q.dequeue()
console.log(q)
console.log(q.front())
console.log(q.back())
console.log(q.empty())
console.log(q.toString())
