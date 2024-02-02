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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inoIndex = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inoIndex.put(inorder[i], i);

        TreeNode root = TreeConstruction(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, inoIndex);
        return root;
    }
    public static TreeNode TreeConstruction(int[] inorder, int inStart, int inEnd, int[] postorder, int posStart, int posEnd, Map<Integer, Integer> inoIndex){
        if(posStart>posEnd || inStart>inEnd)
            return null;
        
        int rootPos = inoIndex.get(postorder[posEnd]);
        int l = rootPos - inStart;

        TreeNode root = new TreeNode(postorder[posEnd]);
        root.left = TreeConstruction(inorder, inStart, rootPos-1, postorder, posStart, posStart+l-1, inoIndex);
        root.right = TreeConstruction(inorder, rootPos+1, inEnd, postorder, posStart+l, posEnd-1, inoIndex);
        return root;
    }
}