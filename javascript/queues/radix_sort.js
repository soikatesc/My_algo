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

function displayArray(arr){
	for(var i=0;i<arr.length-1; i++){
		console.log(arr[i] + " ");
	}
}

function distribute(nums, queues, n, digit) {
	for(var i=0; i < n; i++){
		if(digit == 1){
			console.log(nums[i]%10)
			queues[nums[i]%10].enqueue(nums[i])
		}
	}
}

//main program
var queues = []
for(var i=0; i<10; i++){
	queues[i] = new Queue()
}
var nums = []
for(var i=0; i<10; i++){
	nums[i] = Math.floor(Math.floor(Math.random()*101))
}

console.log("Before Radix Sort: ")
displayArray(nums)
distribute(nums, queues, 10, 1);
console.log(queues)

