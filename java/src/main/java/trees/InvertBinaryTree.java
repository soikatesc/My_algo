package trees;

public class InvertBinaryTree {
    /*
    o(n)
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        InvertTreePrac obj = new InvertTreePrac();
        TreeNode root = new TreeNode(4);

        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(7);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode leftChildLeftChild = new TreeNode(1);
        TreeNode leftChildRightChild = new TreeNode(3);

        leftChild.left = leftChildLeftChild;
        leftChild.right = leftChildRightChild;

        TreeNode rightChildLeftChild = new TreeNode(6);
        TreeNode rightChildRightChild = new TreeNode(9);

        rightChild.left = rightChildLeftChild;
        rightChild.right = rightChildRightChild;

        obj.invertTree(root);
    }
}
