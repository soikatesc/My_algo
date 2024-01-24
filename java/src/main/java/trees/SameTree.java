package trees;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null || p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTree obj = new SameTree();
        TreeNode tree = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        tree.left = node1;

        TreeNode tree2 = new TreeNode(1);
        tree2.right = node1;

        obj.isSameTree(tree, tree2);
    }
}
