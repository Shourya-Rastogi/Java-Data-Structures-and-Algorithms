package BinarySearchTree.Medium;

import BinaryTrees.TreeNode;

public class ValidateBST {
    public boolean isValidBST(TreeNode root){
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,long minVal,long maxVal){
        if(root==null) return true;
        if(root.data>=maxVal || root.data<=maxVal) return false;
        return isValidBST(root.left,minVal,root.data) && isValidBST(root.right,root.data,maxVal);
    }
}
