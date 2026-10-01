package BinaryTrees.Construction;

import BinaryTrees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BTFromPreorderAndInorder {
    // Reconstructs the tree using constant-time
    // average lookup of inorder positions.

    private int preIndex;
    private Map<Integer, Integer> inorderIndex;

    // Builds a subtree using its valid
    // interval in the inorder traversal.
    private TreeNode build(int[] preorder, int inStart, int inEnd)
    {
        if (inStart > inEnd) {
            return null;
        }
        // preIndex points to the next root
        // available in preorder.
        int rootValue = preorder[preIndex++];

        TreeNode root = new TreeNode(rootValue);
        // The stored inorder position divides
        // the current subtree into two ranges.
        int rootIndex = inorderIndex.get(rootValue);

        root.left = build(preorder, inStart, rootIndex - 1);

        root.right = build(preorder,rootIndex + 1, inEnd);
        return root;
    }
    public TreeNode buildTree(int[] preorder,int[] inorder) {
        preIndex = 0;
        inorderIndex = new HashMap<>();
        // Each value is mapped to its unique
        // position in the inorder traversal.
        for (int i = 0; i < inorder.length; i++) {
            inorderIndex.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }
}
