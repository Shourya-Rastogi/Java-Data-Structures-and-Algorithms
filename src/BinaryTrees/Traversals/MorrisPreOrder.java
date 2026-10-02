package BinaryTrees.Traversals;

import BinaryTrees.TreeNode;

import java.util.ArrayList;

public class MorrisPreOrder {
    ArrayList<Integer> getPreOrder(TreeNode root) {
        ArrayList<Integer> preOrder = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                preOrder.add(cur.data);
                cur = cur.right;
            } else {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = cur;
                    preOrder.add(cur.data);
                    cur = cur.left;
                } else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return preOrder;
    }
}
