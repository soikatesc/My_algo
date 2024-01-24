package trees;

public class InvertTreePrac {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return  null;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

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
