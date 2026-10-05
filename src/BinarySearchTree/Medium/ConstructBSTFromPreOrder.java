package BinarySearchTree.Medium;

import BinaryTrees.TreeNode;

public class ConstructBSTFromPreOrder {
    int i=0;
    public TreeNode bstFromPreOrder(int[] A){
        return bstFromPreOrder(A,Integer.MAX_VALUE);
    }
    public TreeNode bstFromPreOrder(int[] A,int bound){
        if(i==A.length || A[i]>bound) return null;
        TreeNode root=new TreeNode(A[i++]);
        root.left=bstFromPreOrder(A,root.data);
        root.right=bstFromPreOrder(A,bound);
        return root;
    }
}
