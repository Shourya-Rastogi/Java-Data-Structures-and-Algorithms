package BinarySearchTree.Basics;

import BinaryTrees.TreeNode;

public class SearchInBST {
    public TreeNode search(TreeNode root, int val){
        TreeNode dummy=root;
        while(dummy!=null && dummy.data!=val){
            dummy=val<dummy.data?dummy.left:dummy.right;
        }
        return dummy;
    }


}
