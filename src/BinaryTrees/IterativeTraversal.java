package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeTraversal {
    List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> preOrder=new ArrayList<Integer>();
        if(root==null) return preOrder;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            preOrder.add(root.data);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
        }
        return preOrder;
    }

    List<Integer> inOrder(TreeNode root){
        List<Integer> inorder=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }
            else{
                if(stack.isEmpty()) break;
                node=stack.pop();
                inorder.add(node.data);
                node=node.right;
            }
        }
        return inorder;
    }
}
