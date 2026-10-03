package BinarySearchTree.Basics;

import BinaryTrees.TreeNode;

public class MaxInBST {
    int max(TreeNode root){
        TreeNode dummy=root;
        while(dummy.right!=null) dummy=dummy.right;
        return dummy.data;
    }
}
