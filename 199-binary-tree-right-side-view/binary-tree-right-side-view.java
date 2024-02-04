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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> r = new ArrayList<>();

        if(root == null)
            return r;
            
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s>0){
                TreeNode t = q.poll();
                if(s==1)
                    r.add(t.val);
                    
                if (t.left != null)
                    q.add(t.left);
                if (t.right != null)
                    q.add(t.right);

                s--;
            }
        }
        return r;
    }
}