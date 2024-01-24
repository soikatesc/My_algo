package trees;

import javafx.util.Pair;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root).getKey();
    }

    public Pair<Boolean, Integer> dfs(TreeNode root) {
        if (root == null) {
            return new Pair<>(true, 0);
        }

        Pair<Boolean, Integer> left = dfs(root.left);
        Pair<Boolean, Integer> right = dfs(root.right);

        boolean balanced = left.getKey()
                && right.getKey()
                && (Math.abs(left.getValue() - right.getValue()) <= 1);

        return new Pair<>(balanced, 1 + Math.max(left.getValue(), right.getValue()));
    }

    public static void main(String[] args) {
        BalancedBinaryTree obj = new BalancedBinaryTree();
        TreeNode tree = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);

        tree.left = node1;
        tree.right = node2;

        node2.left = new TreeNode(15);
        node2.right = new TreeNode(7);

        obj.isBalanced(tree);
    }
}
