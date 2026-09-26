package BinaryTrees;

public class MaximumPathSum {
    private int maxSum;

    // Returns the best extendable path
    // starting from the current node.
    private int findMaxGain(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Negative left contributions are clamped
        // to 0 to avoid reducing the path sum.
        int leftGain = Math.max(0,findMaxGain(root.left));

        // Negative right contributions are clamped
        // to 0 to avoid reducing the path sum.
        int rightGain = Math.max(0,findMaxGain(root.right));

        // Both branches may form a complete
        // path through the current node.
        int currentPath = root.data + leftGain + rightGain;

        maxSum = Math.max(maxSum,currentPath);

        // Only one branch can continue upward
        // without creating a branching path.
        return root.data + Math.max(leftGain,rightGain);
    }

    // Returns the maximum path sum
    // among all non-empty paths.
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;

        findMaxGain(root);

        return maxSum;
    }
}
