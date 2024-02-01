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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inoIndex = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inoIndex.put(inorder[i], i);

        TreeNode root = TreeConstruction(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1, inoIndex);
        return root;
    }
    public static TreeNode TreeConstruction(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd, Map<Integer, Integer> inoIndex){
        if(preStart>preEnd || inStart>inEnd)
            return null;
        
        int rootPos = inoIndex.get(preorder[preStart]);
        int l = rootPos - inStart;

        TreeNode root = new TreeNode(preorder[preStart]);
        root.left = TreeConstruction(inorder, inStart, rootPos-1, preorder, preStart+1, preStart+l, inoIndex);
        root.right = TreeConstruction(inorder, rootPos+1, inEnd, preorder, preStart+l+1, preEnd, inoIndex);
        return root;
    }
}