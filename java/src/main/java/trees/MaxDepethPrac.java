package trees;

public class MaxDepethPrac {
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftMax = dfs(root.left);
        int rightMax = dfs(root.right);

        return 1 + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        MaxDepethPrac obj = new MaxDepethPrac();
        TreeNode root = new TreeNode(3);

        TreeNode leftChild = new TreeNode(9);
        TreeNode rightChild = new TreeNode(20);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode rightChildLeftChild = new TreeNode(15);
        TreeNode rightChildRightChild = new TreeNode(7);

        rightChild.left = rightChildLeftChild;
        rightChild.right = rightChildRightChild;

        obj.maxDepth(root);
    }
}
