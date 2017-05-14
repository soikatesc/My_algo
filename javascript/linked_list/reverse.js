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
		runner.next = prev;
		prev = runner;
		runner = save
	}
	return prev;
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

LinkedList.prototype.kthNode=function(list,num){
	var newList = this.reverse(list)
	var runner = this.head
	var count = 0
	// console.log(newList)
	while(runner){
		count++;
		console.log(count)
		if(count == num){
			console.log(runner.val)
		}
	}
}

var list = new LinkedList()
list.addFront(2)
list.addFront(3)
list.addFront(5)
// console.log(list.reverse())
list.kthNode(list,1)

