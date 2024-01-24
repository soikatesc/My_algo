package trees;

import javafx.util.Pair;

public class BalancedBinaryTreePrac {
    public boolean isBalanced(TreeNode root) {
        return dfs(root).getValue();
    }

    public Pair<Integer, Boolean> dfs(TreeNode root) {
        if (root == null) {
            return new Pair<>(0, true);
        }

        Pair<Integer, Boolean> left = dfs(root.left);
        Pair<Integer, Boolean> right = dfs(root.right);

        boolean isBalanced = left.getValue() && right.getValue() && Math.abs(left.getKey() - right.getKey()) <= 1;

        int depth = 1 + Math.max(left.getKey(), right.getKey());

        return new Pair<>(depth, isBalanced);
    }

    public static void main(String[] args) {
        BalancedBinaryTreePrac obj = new BalancedBinaryTreePrac();
        TreeNode root = new TreeNode(3);

        TreeNode leftChild = new TreeNode(9);
        TreeNode rightChild = new TreeNode(20);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode rightChildLeftChild = new TreeNode(15);
        TreeNode rightChildRightChild = new TreeNode(7);

        rightChild.left = rightChildLeftChild;
        rightChild.right = rightChildRightChild;

        obj.isBalanced(root);
    }
}
