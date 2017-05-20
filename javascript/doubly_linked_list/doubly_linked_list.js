function DLNode(value){
	this.val = value;
	this.prev = null;
	this.next = null;
}

function DList(){
	this._length = 0;
	this.head = null;
	this.tail = null;
}
/////////////////////////////////////
//return front value
DList.prototype.front = function (){
	if(this.head == null){
		return null
	}
	return this.head.val
}

/////////////////////////////////////
DList.prototype.push = function(val){
	this._length ++; 
	var node = new DLNode(val)
	if(!this.head){
		this.head = node;
		this.tail = node;
		return this;
	}
	this.tail.next = node
	node.prev = this.tail
	this.tail = node;
	// console.log(node)

}
/////////////////////////////////////////
DList.prototype.addfront = function(val){
	this._length ++;
	var node = new DLNode(val)
	if(!this.head){
		this.head = node;
		this.tail = node;
		return this;
	}
	this.head.prev = node;
	node.next = this.head;
	this.head = node;
	return this;
}

/////////////////////////////////////////
DList.prototype.display = function(){
	runner = this.head
	var str = "";
	while(runner){
		str = str + runner.val+',';
		runner = runner.next
	}
	console.log(str)
}

//////////////////////////////////////
DList.prototype.reverse = function(){
	runner = this.head
	while(runner.next!=null){
		var a = runner.next;
		var b = runner.prev;
		runner.next=b;
		runner.prev=a;
		if(b==null){
			var temp=this.tail;
			this.tail=runner;
			this.head=temp;
		}

	}
	console.log('reverse display:',this.display())
}

////////////////////test////////////
var list = new DList()
list.push(2)
list.push(3)
list.push(4)
list.addfront(4)
list.display()
list.reverse()


