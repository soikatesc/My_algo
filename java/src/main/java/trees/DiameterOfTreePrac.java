package trees;

public class DiameterOfTreePrac {
    private int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    /**
     * T: O(N)
     * @param root
     * @return
     */
    public int dfs(TreeNode root) {
        if (root == null) return -1;

        int left = dfs(root.left);
        int right = dfs(root.right);
        res = Math.max(res, 2 + left + right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        DiameterOfTreePrac obj = new DiameterOfTreePrac();
        TreeNode root = new TreeNode(1);

        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode leftChildLeftChild = new TreeNode(4);
        TreeNode leftChildRightChild = new TreeNode(5);

        leftChild.left = leftChildLeftChild;
        leftChild.right = leftChildRightChild;

        obj.diameterOfBinaryTree(root);
    }
}
