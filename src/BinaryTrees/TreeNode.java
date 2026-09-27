package BinaryTrees;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        data=val;
    }

    public TreeNode(int val,TreeNode leftNode,TreeNode rightNode){
        data=val;
        left=leftNode;
        right=rightNode;
    }
}
