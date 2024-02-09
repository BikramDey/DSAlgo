/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        return checkBothHalf(root.left, root.right);
    }

    public static boolean checkBothHalf(TreeNode leftside, TreeNode rightside) {
        if (leftside == null || rightside == null)
            return leftside == rightside;
        return (leftside.val == rightside.val && checkBothHalf(leftside.right, rightside.left)
                && checkBothHalf(leftside.left, rightside.right));
    }
}