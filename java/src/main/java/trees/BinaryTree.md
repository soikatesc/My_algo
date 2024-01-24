Search Type:
- Breadth first search 
  - using while loop and queue
- Depth first search
  - recursion

Traverse Type:
- Pre order
- In order
- Post order

-----------------

     5 
    / \
    3  7
   /\
   2 0

- Full binary tree
- Complete binary tree

---------------------------
- inverting a tree

---------------------------
if (root == null) return false;
if (subRoot == null) return true;

boolean isSameTree = isSameTree(root, subRoot);
if (isSameTree == true) {
    return true;
} 

boolean isLeft = isSubtree(root.left, subRoot)
boolean isRight = isSubtree(root.right, subRoot)

return isLeft || isRight;
-------------------------------------------- 

9 3 
