package BinaryTrees;

public class MaximumPathSum {
    int maxPathSum(TreeNode root){
        int maxValue[]=new int[1];
        maxValue[0]=Integer.MAX_VALUE;
        maxPathDown(root,maxValue);
        return maxValue[0];
    }
    int maxPathDown(TreeNode node,int[] maxValue){
        if(node==null) return 0;
        int left=Math.max(0,maxPathDown(node.left,maxValue));
        int right=Math.max(0,maxPathDown(node.right,maxValue));
        maxValue[0]=Math.max(maxValue[0],left+right+node.data);
        return Math.max(left,right)+node.data;
    }
}
