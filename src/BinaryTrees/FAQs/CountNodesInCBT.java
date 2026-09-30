package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

public class CountNodesInCBT {
    int getLeftHeight(TreeNode node){
        int height=0;
        while(node!=null){
            height++;
            node=node.left;
        }
        return height;
    }

    int getRightHeight(TreeNode node){
        int height=0;
        while(node!=null){
            height++;
            node=node.right;
        }
        return height;
    }

    public long countNodes(TreeNode root){
        if(root==null) return 0;
        int leftHeight=getLeftHeight(root);
        int rightHeight=getRightHeight(root);
        if(leftHeight==rightHeight) return (1L<<leftHeight)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
