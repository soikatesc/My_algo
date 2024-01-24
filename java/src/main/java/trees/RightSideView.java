package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int qLength = queue.size();

            while (qLength > 0) {
                TreeNode currNode = queue.remove();

                if (qLength == 1) {
                    result.add(currNode.val);
                }

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
                qLength--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
