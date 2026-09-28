package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result=new ArrayList<>();
        rightView(root,result,0);
        return result;
    }

    public void rightView(TreeNode cur,List<Integer> result,int curDepth){
        if(cur==null){
            return;
        }
        if(curDepth==result.size()){
            result.add(cur.data);
        }
        rightView(cur.right,result,curDepth+1);
        rightView(cur.left,result,curDepth+1);
    }
}
