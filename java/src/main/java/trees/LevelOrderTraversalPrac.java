package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalPrac {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) return output;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // empty list
            List<Integer> list = new ArrayList<>();
            int qLength = queue.size();

            while (qLength != 0) {
                TreeNode head = queue.remove();
                list.add(head.val);
                if (head.left != null) queue.add(head.left);
                if (head.right != null) queue.add(head.right);
                qLength--;
            }

            // add to final output
            output.add(list);
        }

        return output;
    }
    public static void main(String[] args) {
        LevelOrderTraversalPrac obj = new LevelOrderTraversalPrac();
        TreeNode root = new TreeNode(3);

        TreeNode leftChild = new TreeNode(9);
        TreeNode rightChild = new TreeNode(20);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode rightChildLeftChild = new TreeNode(15);
        TreeNode rightChildRightChild = new TreeNode(7);

        rightChild.left = rightChildLeftChild;
        rightChild.right = rightChildRightChild;
        obj.levelOrder(root);
    }
}
