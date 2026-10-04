package BinarySearchTree.Medium;

import BinaryTrees.TreeNode;

public class LowestCommonAncestorInBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;
        int cur=root.data;
        if(cur<p.data && cur<q.data) return lowestCommonAncestor(root.right,p,q);
        if(cur>p.data && cur>q.data) return lowestCommonAncestor(root.left,p,q);
        return root;
    }
}
