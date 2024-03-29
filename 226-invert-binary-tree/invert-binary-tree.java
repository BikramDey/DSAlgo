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
    public TreeNode invertTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return root;

        TreeNode templ = invertTree(root.left);
        TreeNode tempr = invertTree(root.right);
        root.left = tempr;
        root.right = templ;
        return root;
    }
}