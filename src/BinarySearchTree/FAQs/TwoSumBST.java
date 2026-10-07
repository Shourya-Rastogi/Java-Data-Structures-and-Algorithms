package BinarySearchTree.FAQs;

import BinaryTrees.TreeNode;

import java.util.Stack;

class BSTIterator2 {
    private Stack<TreeNode> stack=new Stack<TreeNode>();
    boolean reverse=false;
    public BSTIterator2(TreeNode root,boolean isReverse) {
        reverse=isReverse;
        pushAll(root);
    }

    public boolean hasNext()
    {
        return !stack.isEmpty();
    }
    public int next(){
        TreeNode tmpNode=stack.pop();
        if(!reverse) pushAll(tmpNode.right);
        else pushAll(tmpNode.left);
        return tmpNode.data;
    }
    private void pushAll(TreeNode node)
    {
        while(node!=null){
            stack.push(node);
            if(reverse) node=node.right;
            else node =node.left;
        }
    }

}

public class TwoSumBST {
    public boolean findTarget(TreeNode root,int k) {
        if (root == null) return false;
        BSTIterator2 l=new BSTIterator2(root,false);
        BSTIterator2 r=new BSTIterator2(root,true);
        int i=l.next();
        int j=r.next();
        while(i<j){
            if(i+j==k) return true;
            else if(i+j<k) i= l.next();
            else j=r.next();
        }
        return false;
    }
}
