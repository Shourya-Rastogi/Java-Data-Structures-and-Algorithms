package BinaryTrees;

public class SymmetricBinaryTree {
    boolean isSymmetric(TreeNode root){
        return (root==null) || isSymmetricHelp(root.left,root.right);
    }

    boolean isSymmetricHelp(TreeNode left,TreeNode right){
        if(left==null || right==null) return left==right;
        if(left.data!=right.data) return false;
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }
}
