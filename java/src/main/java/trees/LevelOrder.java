package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    /**
     * T: o(n) S: O(n)
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> currentLevelValues = new ArrayList<>();
            int qLength = queue.size();

            while (qLength > 0) {
                TreeNode currNode = queue.remove();
                currentLevelValues.add(currNode.val);
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
                qLength--;
            }

            result.add(currentLevelValues);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
