package BinaryTrees;

public class RecursiveTraversals {
    private void preorder(TreeNode node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    private void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    private void postorder(TreeNode node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data+" ");
    }
}
