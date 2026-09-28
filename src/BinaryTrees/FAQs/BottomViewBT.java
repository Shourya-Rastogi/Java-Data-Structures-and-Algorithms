package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.*;

public class BottomViewBT {
    public ArrayList<Integer> bottomView(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair it=q.remove();
            int hd=it.hd;
            TreeNode temp=it.node;
            map.put(hd,temp.data);
            if(temp.left!=null) q.add(new Pair(hd-1,temp.left));
            if(temp.right!=null) q.add(new Pair(hd+1,temp.right));
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
