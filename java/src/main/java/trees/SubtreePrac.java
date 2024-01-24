package trees;

public class SubtreePrac {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return true;

        SameTreePrac obj = new SameTreePrac();
        boolean isSameTree = obj.isSameTree(root, subRoot);
        if (isSameTree == true) {
            return true;
        }

        boolean isLeft = isSubtree(root.left, subRoot);
        boolean isRight = isSubtree(root.right, subRoot);

        return isLeft || isRight;
    }
    public static void main(String[] args) {
        SubtreePrac obj = new SubtreePrac();
        TreeNode root = new TreeNode(3);

        TreeNode leftChild = new TreeNode(4);
        TreeNode rightChild = new TreeNode(5);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode leftChildLeftChild = new TreeNode(0);
        TreeNode leftChildRightChild = new TreeNode(2);

        leftChild.left = leftChildLeftChild;
        leftChild.right = leftChildRightChild;

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        obj.isSubtree(root, subRoot);
    }
}
