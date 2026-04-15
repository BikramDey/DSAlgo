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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        traversal(root, arr);
        return arr;
    }
    public static void traversal(TreeNode root, List<Integer> arr) {
        if(root == null)
            return;
        traversal(root.left, arr);
        arr.add(root.val);
        traversal(root.right, arr);
    }
}