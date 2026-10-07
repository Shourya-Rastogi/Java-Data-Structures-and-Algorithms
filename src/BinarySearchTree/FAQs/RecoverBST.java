package BinarySearchTree.FAQs;

import BinaryTrees.TreeNode;

public class RecoverBST {
    private TreeNode first,prev,middle,last;
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && (root.data<prev.data)){
            if(first==null){
                first=prev;
                middle=root;
            }
            else last=root;
        }
        prev=root;
        inorder(root.right);
    }

    public void recoverTree(TreeNode root){
        first=middle=last=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t=first.data;
            first.data=last.data;
            last.data=t;
        }
        else if(first!=null && middle!=null){
            int t=first.data;
            first.data=middle.data;
            middle.data=t;
        }
    }
}
