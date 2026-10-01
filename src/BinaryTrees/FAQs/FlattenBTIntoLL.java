package BinaryTrees.FAQs;

import BinaryTrees.TreeNode;

import java.util.Stack;

public class FlattenBTIntoLL {
    public void flatten(TreeNode root) {
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left!=null){
                TreeNode prev=cur.left;
                while(prev.right!=null){
                    prev=prev.right;
                }
                prev.right=cur.right;
                cur.right=cur.left;
                cur.left=null;
            }
            cur=cur.right;
        }
    }

    private void flatten2(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode cur=st.pop();
            if(cur.right!=null) st.push(cur.right);
            if(cur.left!=null) st.push(cur.left);
            if(!st.isEmpty()) cur.right=st.peek();
            cur.left=null;
        }
    }
}
