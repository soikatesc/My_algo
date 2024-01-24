package trees;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean dfs(TreeNode root, int min, int max) {
        if (root.val <= min && root.val >= max) return false;

        if (root.left != null) {
            if (!dfs(root.left, min, root.val)) {
                return false;
            }
        }
        if (root.right != null) {
            if (!dfs(root.right, root.val, max)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree obj = new ValidateBinarySearchTree();

        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);

        obj.isValidBST(tree);
    }
}
