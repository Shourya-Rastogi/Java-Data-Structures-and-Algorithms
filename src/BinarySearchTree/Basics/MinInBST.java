package BinarySearchTree.Basics;

import BinaryTrees.TreeNode;

public class MinInBST {
    int min(TreeNode root){
        TreeNode dummy=root;
        while(dummy.left!=null) dummy=dummy.left;
        return dummy.data;
    }
}
