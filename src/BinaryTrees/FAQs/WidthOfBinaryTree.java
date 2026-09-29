package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.*;

class Pair1{
    TreeNode node;
    int num;
    public Pair1(TreeNode node, int num){
        this.node=node;
        this.num=num;
    }
}
public class WidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root){
        if(root==null) return 0;
        int ans=0;
        Queue<Pair1> q=new LinkedList<>();
        q.offer(new Pair1(root,0));
        while (!q.isEmpty()){
            int size=q.size();
            int min=q.peek().num;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                int cur_id=q.peek().num-min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first=cur_id;
                if(i==size-1) last=cur_id;
                if(node.left!=null) q.offer(new Pair1(node.left,cur_id*2+1));
                if(node.right!=null) q.offer(new Pair1(node.right,cur_id*2+2));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}
