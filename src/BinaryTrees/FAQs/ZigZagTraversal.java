package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Deque<TreeNode> q=new LinkedList<>();
        q.addFirst(root);
        boolean reverse=false;
        while(!q.isEmpty()){
            List<Integer> current=new ArrayList<>();
            int level=q.size();
            for(int i=0;i<level;i++){
                if(!reverse){
                    TreeNode cur=q.pollFirst();
                    current.add(cur.data);
                    if(cur.left!=null) q.addLast(cur.left);
                    if(cur.right!=null) q.addLast(cur.right);
                }
                else{
                    TreeNode cur=q.pollLast();
                    current.add(cur.data);
                    if(cur.right!=null) q.addFirst(cur.right);
                    if(cur.left!=null) q.addLast(cur.left);
                }
            }
            res.add(current);
            reverse=!reverse;
        }
        return res;
    }
}
