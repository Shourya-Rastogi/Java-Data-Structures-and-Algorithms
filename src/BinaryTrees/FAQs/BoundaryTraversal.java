package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.ArrayList;

public class BoundaryTraversal {
    void addLeftBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode cur=root.left;
        while(cur!=null){
            if(!isLeaf(cur)) res.add(cur.data);
            if(cur.left!=null) cur=cur.left;
            else cur=cur.right;
        }
    }

    void addRightBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode cur=root.right;
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        while(cur!=null){
            if(!isLeaf(cur)) res.add(cur.data);
            if(cur.right!=null) cur=cur.right;
            else cur=cur.left;
        }
        for(int i=tmp.size()-1;i>=0;--i){
            res.add(tmp.get(i));
        }
    }

    void addLeaves(TreeNode root,ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null) addLeaves(root.left,res);
        if(root.right!=null) addLeaves(root.right,res);
    }

    ArrayList<Integer> printBoundary(TreeNode node){
        ArrayList<Integer> ans=new ArrayList<>();
        if(!isLeaf(node)) ans.add(node.data);
        addLeftBoundary(node,ans);
        addLeaves(node,ans);
        addRightBoundary(node,ans);
        return ans;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left==null && node.right==null;
    }
}
