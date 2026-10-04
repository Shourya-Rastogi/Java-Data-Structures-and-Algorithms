package BinaryTrees.Construction;

import BinaryTrees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BtFromPostOrderAndInOrder {

    private static Map<Integer, Integer> idx;
    private static int[] post;
    private static int postIdx;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) return null;

        int n = inorder.length;
        idx = new HashMap<>(n * 2);
        for (int i = 0; i < n; i++) idx.put(inorder[i], i);

        post = postorder;
        postIdx = n - 1;
        return build(0, n - 1);
    }

    private static TreeNode build(int lo, int hi) {
        if (lo > hi) return null;

        int val = post[postIdx--];
        TreeNode root = new TreeNode(val);
        int mid = idx.get(val);

        root.right = build(mid + 1, hi);   // right first!
        root.left  = build(lo, mid - 1);
        return root;
    }
    private static void preorder(TreeNode node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    static void main() {
        int[] inorder={4,2,5,1,6,8};
        int[] postorder={4,5,2,6,8,1};
        TreeNode root=buildTree(inorder,postorder);
        preorder(root);
    }
}
