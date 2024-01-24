package trees;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode cur = root;

        while (cur != null) {
            if (p.val > cur.val && q.val > cur.val) {
                cur = cur.right;
            } else if (p.val < cur.val && q.val < cur.val) {
                cur = cur.left;
            } else {
                return cur;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        LowestCommonAncestor obj = new LowestCommonAncestor();

        TreeNode tree = new TreeNode(6);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(8);
        tree.left = node1;
        tree.right = node2;

        TreeNode node3 = new TreeNode(4);;
        node1.left = new TreeNode(0);
        node1.right = node3;

        node3.left = new TreeNode(3);
        node3.right = new TreeNode(5);

        node2.left = new TreeNode(7);
        node2.right = new TreeNode(9);

        obj.lowestCommonAncestor(tree, new TreeNode(2), new TreeNode(4));
    }
}
