package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeftSideView {
    public List<Integer> leftSideView(TreeNode root){
        List<Integer> result=new ArrayList<>();
        leftView(root,result,0);
        return result;
    }

    public void leftView(TreeNode cur,List<Integer> result,int curDepth){
        if(cur==null){
            return;
        }
        if(curDepth==result.size()){
            result.add(cur.data);
        }
        leftView(cur.right,result,curDepth+1);
        leftView(cur.left,result,curDepth+1);
    }
}
