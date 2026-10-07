package BinarySearchTree.FAQs;

import BinaryTrees.TreeNode;

public class RecoverBST2 {
    TreeNode first;
    TreeNode second;
    TreeNode prev;

    public void recoverTree(TreeNode root) {
        helper(root);
        // Swap the values of the two misplaced nodes
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }

    void helper(TreeNode node) {
        if (node == null) return;

        // Traverse left subtree
        helper(node.left);

        // Detect swapped nodes
        if (prev != null && prev.data > node.data) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }

        prev = node;

        // Traverse right subtree
        helper(node.right);
    }
}
