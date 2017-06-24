
//node 
function BTNode(value){
	this.value = value;
	this.left = null;
	this.right = null;
}

//constructior for binary search tree
function BST(){
	this.root = null;
}

BST.prototype.add = function(value){
	var root = this.root;

	if(!root){
		this.root = new BTNode(value)
		return this;
	}

	var runner = this.root
	var newNode = new BTNode(value)

	while(runner){
		if(value < runner.value){
			if(!runner.left){
				runner.left = newNode
				return this;
			}
			else{
				runner = runner.left;
			}
		}
		else{
			if(!runner.right){
				runner.right = newNode;
				return this;
			}
			else{
				runner = runner.right
			}
		}
	}
}

BST.prototype.contains = function(value){
	var runner = this.root

	while(runner){
		if(value == runner.value){
			return true;
		}
		if(value < runner.value){
			runner = runner.left;
		}else{
			runner = runner.right;
		}
	}
	return false;
}

BST.prototype.min = function(){
	runner = this.root
	if(!runner){
		return "tree is empty";
	}

	while(runner.left){
		runner = runner.left
	}
	return runner.value
}

BST.prototype.max = function(){
	runner = this.root
	if(!runner){
		return "tree is empty";
	}

	while(runner.right){
		runner = runner.right
	}
	return runner.value
}

var bst = new BST()
bst.add(5)
bst.add(6)
bst.add(7)
bst.add(4)
console.log(bst.contains(10))
console.log(bst.min())
console.log(bst.max())


