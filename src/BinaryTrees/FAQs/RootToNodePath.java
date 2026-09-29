package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.ArrayList;

public class RootToNodePath {
    private boolean getPath(TreeNode root, ArrayList<Integer> arr, int x){
        if(root==null) return false;
        arr.add(root.data);
        if(root.data==x ) return true;
        if(getPath(root.left,arr,x) || getPath(root.right,arr,x)) return true;
        arr.remove(arr.size()-1);
        return false;
    }
    ArrayList<Integer> solve(TreeNode A,int B){
        ArrayList<Integer> arr=new ArrayList<>();
        if(A==null) return arr;
        getPath(A,arr,B);
        return arr;
    }
}
