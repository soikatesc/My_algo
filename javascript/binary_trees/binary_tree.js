
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

BST.prototype.isEmpty = function(){
	runner = this.root
	if(!runner){
		return true;
	}
	return false;
}


// BST.prototype.size = function(){
// 	runner = this.root
	
// }

BST.prototype.height = function(node){
	// if(node){
	// 	console.log(node.value)
	// } else {
	// 	console.log('null');
	// }
	if(!node){
		// console.log('-1')
		return -1;
	} else if(!node.right && !node.left) {
		console.log('1, val: ', node.value)
		return 1;
	}
	var left = this.height(node.left)
	var right = this.height(node.right)
	console.log('left: ', left)
	console.log('right: ', right)
	return Math.max(left, right) + 1
}



var bst = new BST()
bst.add(10)
bst.add(8)
bst.add(7)
// bst.add(3)
// bst.add(4)
console.log("Contains:", bst.contains(10))
console.log("Max:", bst.min())
console.log("Min:", bst.max())
console.log("Is empty: ", bst.isEmpty())
console.log('height of node:', bst.height(bst.root))


