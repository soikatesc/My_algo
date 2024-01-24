package trees;

public class ValidateBinarySearchTreePrac {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public boolean dfs(TreeNode root, double min, double max) {
        if (root == null) return true;

        if (root.val >= max || root.val <= min) {
            return false;
        }

        boolean left = dfs(root.left, min, root.val);
        boolean right = dfs(root.right, root.val, max);

        return left && right;
    }

    public static void main(String[] args) {
        ValidateBinarySearchTreePrac obj = new ValidateBinarySearchTreePrac();
        TreeNode root = new TreeNode(5);

        TreeNode leftChild = new TreeNode(1);
        TreeNode rightChild = new TreeNode(4);

        root.left = leftChild;
        root.right = rightChild;


        TreeNode rightChildLeftChild = new TreeNode(3);
        TreeNode rightChildRightChild = new TreeNode(6);

        rightChild.left = rightChildLeftChild;
        rightChild.right = rightChildRightChild;

        obj.isValidBST(root);
    }
}
