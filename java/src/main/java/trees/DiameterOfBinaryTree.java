package trees;

public class DiameterOfBinaryTree {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if (root == null) return -1;

        int left = dfs(root.left);
        int right = dfs(root.right);

        max = Math.max(max, 2 + left + right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree obj = new DiameterOfBinaryTree();
        TreeNode tree = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        tree.left = node1;
        tree.right = node2;

        node1.left = new TreeNode(4);
        node1.right = new TreeNode(5);

        obj.diameterOfBinaryTree(tree);
    }
}
