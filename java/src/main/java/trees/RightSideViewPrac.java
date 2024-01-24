package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewPrac {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) return output;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int qLength = queue.size();

            while (qLength != 0) {
                TreeNode node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                qLength--;
                if (qLength == 0) {
                    output.add(node.val);
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        RightSideViewPrac obj = new RightSideViewPrac();
        TreeNode root = new TreeNode(1);

        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode rightChildRightChild = new TreeNode(4);

        rightChild.right = rightChildRightChild;

        TreeNode leftChildRightChild = new TreeNode(5);
        leftChild.right = leftChildRightChild;

        obj.rightSideView(root);
    }
}
