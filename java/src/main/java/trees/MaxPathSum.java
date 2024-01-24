package trees;

public class MaxPathSum {
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftVal = dfs(root.left);
        int rightVal = dfs(root.right);

        int val = root.val + leftVal + rightVal;

        max = Math.max(val, max);
        max = Math.max(max, root.val);
        max = Math.max(max, leftVal);
        max = Math.max(max, rightVal);

        return val;
    }
    public static void main(String[] args) {
        MaxPathSum obj = new MaxPathSum();
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        obj.maxPathSum(tree);
    }
}
