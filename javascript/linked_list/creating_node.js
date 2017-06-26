function Node(val){
	this.val = val;
	this.next = null;
}

function LinkedList(){
	this.head = null;
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

LinkedList.prototype.contains = function(val){
	var runner = this.head;
	while(runner != null){
		if (runner.val == val){
			return true;
		}
		runner = runner.next;
	}
	return false;
}

LinkedList.prototype.removeFront = function(){
	if(this.head == null){
		return this;
	}

	if(this.head.next == null){
		this.head = null;
	}

	else{
		this.head = this.head.next
	}
}

LinkedList.prototype.Front = function(){
	if(this.head == null){
		return null;
	}
	return this.head.val;
}

LinkedList.prototype.Length = function(){
	runner = this.head;
	count = 0;
	while(runner != null){
		count++;
		runner = runner.next
	}
	return count;
}

LinkedList.prototype.display = function(){
	var str = "";
	var runner = this.head;

	while(runner){
		str = str + runner.val+' -> ';
		runner = runner.next;
	}

	console.log('Linked List: ', str)
}

LinkedList.prototype.isEmpty = function(){
	if(this.head == null){
		return true;
	}
	return false;
}

LinkedList.prototype.max = function(){
	if(this.isEmpty() == true){
		return this;
	}
	var max = this.head.val;
	var runner = this.head;

	while(runner != null){
		if(max<runner.val){
			max = runner.val;
		}
		runner = runner.next;
	}
	return max;
}

LinkedList.prototype.min = function(){
	if(this.isEmpty() == true){
		return this;
	}
	var min = this.head.val;
	var runner = this.head;

	while(runner != null){
		if(min>runner.val){
			min = runner.val;
		}
		runner = runner.next;
	}
	return min;
}

LinkedList.prototype.back=function(){
	runner = this.head;
	while(runner){
		if(runner.next == null){
			return runner.val;
		}
		runner = runner.next;
	}
}

LinkedList.prototype.removeBack=function(){
	runner = this.head;
	prev = null;
	while(runner){
		if(runner.next == null){
			prev.next = null;
		}
		prev = runner;
		runner = runner.next;
	}
}

LinkedList.prototype.addBack=function(val){
	runner = this.head;
	var new_node = new Node(val);
	while(runner){
		if(runner.next == null){
			runner.next = new_node;
			new_node.next = null;
		}
		runner = runner.next;
	}
}


LinkedList.prototype.MoveMinFront=function(){
	var new_node = new Node(this.min())
	runner = this.head;
	prev = null;
	while(runner){
		if (runner.val == this.min()){
			prev.next = runner.next;
		}
		prev = runner;
		runner = runner.next;
	}
	this.addFront(new_node.val)

}

LinkedList.prototype.MoveMaxBack=function(){
	var new_node = new Node(this.max())
	console.log(this.max())
	runner = this.head;
	prev = null;
	while(runner){
		if (runner.val == this.max()){
			prev.next = runner.next;
		}
		prev = runner;
		runner = runner.next;
	}
	this.addBack(new_node.val)
}

LinkedList.prototype.prependVal = function( val, before){
	var new_node = new Node(val)
	runner = this.head
	prev = null

	while(runner){
		if( before == runner.next.val ){

		}
	}
}


// module.exports = {
//   Node : Node,
//   LinkedList : LinkedList,
// }
// module.exports = Node;
module.exports = LinkedList;


