package BinarySearchTree.Medium;

import BinaryTrees.TreeNode;

public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        TreeNode successor=null;
        while(root!=null){
            if(p.data>=root.data) root=root.right;
            else{
                successor=root;
                root=root.left;
            }
        }
        return successor;
    }
}
