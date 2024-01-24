package trees;

public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot ==  null) return true;
        if (root == null) return false;

        SameTree obj = new SameTree();
        boolean isSameTree = obj.isSameTree(root, subRoot);
        if (isSameTree) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        SubTree obj = new SubTree();
        TreeNode tree = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        tree.left = node1;
        tree.right = node2;

        node1.left = new TreeNode(1);
        node1.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(4);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(2);

        obj.isSubtree(tree, tree2);
    }
}
