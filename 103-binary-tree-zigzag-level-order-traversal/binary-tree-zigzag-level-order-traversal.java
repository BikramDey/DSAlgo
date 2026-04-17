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
            
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while(!deque.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int n = deque.size();
            while(n-->0){
                TreeNode temp = null;
                if(leftToRight){
                    temp = deque.pollFirst();
                    if (temp.left != null)
                        deque.addLast(temp.left);
                    if (temp.right != null)
                        deque.addLast(temp.right);
                }else{
                    temp = deque.pollLast();
                    if (temp.right != null)
                        deque.addFirst(temp.right);
                    if (temp.left != null)
                        deque.addFirst(temp.left);
                }
                ans.add(temp.val);
            }
            r.add(ans);
            leftToRight = !leftToRight;
        }
        return r;
    }
    // if (root == null) return result;
    // Queue q = new LinkedList<>();
    // q.offer(root);
    // boolean leftToRight = true;

    // while (!q.isEmpty()) {
    //     int size = q.size();
    //     Integer[] level = new Integer[size];
    //     for (int i = 0; i < size; i++) {
    //         TreeNode curr = q.poll();
    //         int index = leftToRight ? i : size - 1 - i;
    //         level[index] = curr.val;

    //         if (curr.left != null) q.offer(curr.left);
    //         if (curr.right != null) q.offer(curr.right);
    //     }
    //     result.add(Arrays.asList(level));
    //     leftToRight = !leftToRight;
    // }
    // return result;
}