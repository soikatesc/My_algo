package trees;

public class MaxDepthOfBinaryTree {

    /**
     * Search Type: DFS
     * Traversing Order :
     * @param root
     * @return
     */
    public static int Solution(TreeNode root) {
        return maxDepth(root, 0);
    }

    public static int maxDepth(TreeNode root, int count) {
        if (root == null) {
            return count;
        }

        int left = maxDepth(root.left, count + 1);
        int right = maxDepth(root.right, count + 1);

        return Math.max(left, right);
    }

    public static void main(String[] args) {
        Solution(null);
    }
}
