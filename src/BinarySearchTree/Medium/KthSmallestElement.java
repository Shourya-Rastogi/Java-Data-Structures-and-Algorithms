package BinarySearchTree.Medium;

import BinaryTrees.TreeNode;

import java.util.ArrayList;

public class KthSmallestElement {
    static int kthSmallest(TreeNode root, int k){
        int count=0;
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                count++;
                if(count==k) return cur.data;
                cur=cur.right;
            }
            else{
                TreeNode prev=cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=cur;
                    cur=cur.left;
                }
                else{
                    prev.right=null;
                    count++;
                    if(count==k) return cur.data;
                    cur=cur.right;
                }
            }
        }
        return -1;
    }

    static void main() {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.left.right=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(8);
        int kth=kthSmallest(root,3);
        System.out.println(kth);
    }
}
