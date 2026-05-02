/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValid(TreeNode curr, long lo, long hi) {
        if (curr == null) return true;
        if (curr.val <= lo || curr.val >= hi) return false;
        return isValid(curr.left, lo, curr.val) && isValid(curr.right, curr.val, hi);
    }
}