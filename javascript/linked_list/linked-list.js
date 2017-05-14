 //constractor function for linked list

function LinkedList(){
	this.head = null;
}

//most efficient way to create a prototype of the function
//ability to loose private 

//chek if the link list is empty
LinkedList.prototype.isEmpty = function(){
	return this.head === null;
};

//size of the link list
// [10] -> [20] -> [30] -> null
LinkedList.prototype.size = function(){
	var current = this.head;
	var count = 0;

	while(current != null){
		count++;
		current = current.next;
	}
	return count;
}

//prepand 
	// 1. create a new node with val
	// 2. Make the new node point to the current head 
	// 3. update this.head point to the new node
LinkedList.prototype.prepand = function(val){
	var newNode = {
		data : val,
		next : this.head,
	};

	this.head = newNode;

}

LinkedList.prototype.append = function(val){
	var newNode = {
		data : val,
		next : null,
	};

	if(this.isEmpty()){
		this.head = newNode;
		return;
	}

	var current = this.head;

	while(current.next!=null){
		current = current.next;
	}
	
	current.next = newNode;
	
}

LinkedList.prototype.contains = function(val){
	var current = this.head;
	while(current != null){
		if(current.val == val){
			return true;			
		}
		current = current.next;
	}
	return false;
};

LinkedList.prototype.remove = function(val){
	if(!this.contains(val)){
		return;
	}

	if(this.head.data === val){
		this.head = this.head.next;
		return;
	}

	var prev = null;
	var current = this.head;
	while(current.data != val){
		prev = current;
		current = current.next;
	}
	prev.next = current.next;
}

LinkedList.prototype.print = function(){
	var output = '[';
	var current = this.head;

	while(current !== null){
		output += current.data;
		if(current.next !== null){
			output += ',';
		}
		current = current.next;
	}

	output += ']';
	console.log(output);
}

var list = new LinkedList();
list.append(10);
list.append(5);
list.prepand(2);
list.remove(5);
list.print()


