package trees;

public class LowestCommonAncestorPrac {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;

        while (curr != null) {
            if (p.val < curr.val && q.val < curr.val) {
                curr = curr.left;
            } else if (p.val > curr.val && q.val > curr.val) {
                curr = curr.right;
            } else {
                return curr;
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        LowestCommonAncestorPrac obj = new LowestCommonAncestorPrac();
        TreeNode root = new TreeNode(6);

        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(8);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode leftChildLeftChild = new TreeNode(0);
        TreeNode leftChildRightChild = new TreeNode(4);

        TreeNode rightChildLeftChild = new TreeNode(7);
        TreeNode rightChildRightChild = new TreeNode(9);

        rightChild.left = rightChildLeftChild;
        rightChild.right = rightChildRightChild;

        leftChild.left = leftChildLeftChild;
        leftChild.right = leftChildRightChild;

        obj.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4));
    }
}
