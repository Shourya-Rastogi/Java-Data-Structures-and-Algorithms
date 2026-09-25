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

    List<Integer> postOrder2Stacks(TreeNode root){
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        List<Integer> postOrder=new ArrayList<>();
        if(root==null) return postOrder;
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.add(root);
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st2.push(root.right);
        }
        while(!st2.isEmpty()){
            postOrder.add(st2.pop().data);
        }
        return postOrder;
    }

    List<Integer> postOrder1Stacks(TreeNode root){
        TreeNode curr=root;
        Stack<TreeNode> st=new Stack<>();
        List<Integer> post=new ArrayList<>();
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            else{
                TreeNode temp=st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    post.add(temp.data);
                    while(!st.empty() && temp==st.peek().right){
                        temp=st.pop();
                        post.add(temp.data);
                    }
                }
                else{
                    curr=temp;
                }
            }
        }
        return post;
    }

    class Pair {
        TreeNode node;
        int val;

        Pair(TreeNode node, int val) {
            this.node = node;
            this.val = val;
        }
    }
    void preInPostTraversal(TreeNode root){
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        if(root==null) return;
        while(!st.isEmpty()){
            Pair it=st.pop();
            if(it.val==1){
                pre.add(it.node.data);
                it.val++;
                st.push(it);
                if(it.node.left!=null){
                    st.push(new Pair(it.node.left,1));
                }
            }
            else if(it.val==2){
                in.add(it.node.data);
                it.val++;
                st.push(it);
                if(it.node.right!=null){
                    st.push(new Pair(it.node.right,1));
                }
            }
            else{
                post.add(it.node.data);
            }
        }
    }
}
