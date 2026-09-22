package BinaryTrees;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        data=val;
    }

    public TreeNode(int val,TreeNode leftNode,TreeNode rightNode){
        data=val;
        left=leftNode;
        right=rightNode;
    }

}
