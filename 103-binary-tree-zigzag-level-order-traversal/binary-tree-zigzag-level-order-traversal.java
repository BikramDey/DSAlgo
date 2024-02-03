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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> r = new ArrayList<>();
        boolean leftToRight = true; 
        //F is used as a flag for left to right or vice-versa on alternate levels

        if(root == null)
            return r;
            
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> a = new ArrayList<>();
            while(s-->0){
                TreeNode t = null;
                if(leftToRight){
                    t = q.pollFirst();
                    if (t.left != null)
                        q.addLast(t.left);
                    if (t.right != null)
                        q.addLast(t.right); 
                }else{
                    t = q.pollLast();
                    if (t.right != null)
                        q.addFirst(t.right); 
                    if (t.left != null)
                        q.addFirst(t.left);
                }
                a.add(t.val);
            }
            r.add(a);
            leftToRight = !leftToRight;
        }
        return r;
    }
}