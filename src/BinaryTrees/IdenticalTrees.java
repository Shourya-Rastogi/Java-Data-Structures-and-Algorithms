package BinaryTrees;

public class IdenticalTrees {
    boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null || q==null){
            return (p==q);
        }
        return((p.data==q.data)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right));
    }
}
