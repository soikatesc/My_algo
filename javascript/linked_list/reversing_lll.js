function Node(val){
	this.val = val;
	this.next = null;
}

function LinkedList(){
	this.head = null;
}

LinkedList.prototype.reverse = function(){
	var runner = this.head;
	var prev = null;

	while(runner){
		var save = runner.next;
		runner = runner.next;
		prev = runner;
		this.head =save
	}
	return prev
}

LinkedList.prototype.addFront = function(val){
	var new_node = new Node(val);
	if(this.head == null){
		this.head = new_node;
	}
	else{
		new_node.next = this.head;
		this.head = new_node;
	}
	return this
}

LinkedList.prototype.display = function(){
	var str = "";
	var runner = this.head;

	while(runner){
		str = str + runner.val+', ';
		runner = runner.next;
	}

	console.log(str);
}

var list = new LinkedList()
list.addFront(5)
list.addFront(1)
list.addFront(11)
list.display()
console.log(list.reverse())


