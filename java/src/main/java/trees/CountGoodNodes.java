package trees;

public class CountGoodNodes {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode root, int maxVal) {
        if (root == null) {
            return 0;
        }


        int count = root.val >= maxVal ? 1 : 0;

        int leftCount = dfs(root.left, Math.max(maxVal, root.val));
        int rightCount = dfs(root.right, Math.max(maxVal, root.val));

        return count + leftCount + rightCount;
    }

    public static void main(String[] args) {
        CountGoodNodes obj = new CountGoodNodes();
        TreeNode root = new TreeNode(3);

        TreeNode leftChild = new TreeNode(1);
        TreeNode rightChild = new TreeNode(4);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode leftChildLeftChild = new TreeNode(3);

        TreeNode rightChildLeftChild = new TreeNode(1);
        TreeNode rightChildRightChild = new TreeNode(5);

        rightChild.left = rightChildLeftChild;
        rightChild.right = rightChildRightChild;

        leftChild.left = leftChildLeftChild;
        obj.goodNodes(root);
    }
}
