package trees;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserializeBinaryTree {
    private int idx = 0;

    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, list);
        return String.join(",", list);
    }

    public void dfs(TreeNode root, List<String> list) {
        if (root == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(root.val));
        dfs(root.left, list);
        dfs(root.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        return deDfs(vals);
    }

    public TreeNode deDfs(String[] vals) {
        if (vals[idx].equals("null")) {
            idx += 1;
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(vals[idx]));
        idx += 1;
        node.left = deDfs(vals);
        node.right = deDfs(vals);
        return node;
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree obj = new SerializeAndDeserializeBinaryTree();
        TreeNode root = new TreeNode(1);

        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);

        root.left = leftChild;
        root.right = rightChild;

        TreeNode rightChildLefChild = new TreeNode(4);
        TreeNode rightChildRightChild = new TreeNode(5);

        rightChild.right = rightChildRightChild;
        rightChild.left = rightChildLefChild;

        String seriResult = obj.serialize(root);
        obj.deserialize(seriResult);
    }
}
