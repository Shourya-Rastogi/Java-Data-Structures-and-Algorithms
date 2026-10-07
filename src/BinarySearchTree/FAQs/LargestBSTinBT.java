package BinarySearchTree.FAQs;

import BinaryTrees.TreeNode;

class NodeValue{
    public int maxNode,minNode,maxSize;
    NodeValue(int minNode,int maxNode,int maxSize){
        this.minNode=minNode;
        this.maxNode=maxNode;
        this.maxSize=maxSize;
    }
}
public class LargestBSTinBT {
    private NodeValue largestBSTSubtreeHelper(TreeNode root){
        if(root==null) return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        NodeValue left=largestBSTSubtreeHelper(root.left);
        NodeValue right=largestBSTSubtreeHelper(root.right);
        if(left.maxNode<root.data && root.data<right.minNode){
            return new NodeValue(Math.min(root.data,left.minNode),Math.max(root.data,right.maxNode),left.maxSize+right.maxSize+1);
        }
        return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.maxSize,right.maxSize));
    }
    public int largestBSTSubtree(TreeNode root){
        return largestBSTSubtreeHelper(root).maxSize;
    }
}
