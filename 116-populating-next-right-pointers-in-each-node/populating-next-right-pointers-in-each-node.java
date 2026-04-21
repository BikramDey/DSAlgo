/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {

        if(root == null)
            return root;
            
        // Deque<Node> q = new LinkedList<>();
        // q.add(root);
        // root.next = null;
        // while(!q.isEmpty()){
        //     int s = q.size();
        //     while(s>0){
        //         Node t = q.poll();
        //         t.next = q.peek();
        //         if(s==1)
        //             t.next = null;
                    
        //         if (t.left != null)
        //             q.add(t.left);
        //         if (t.right != null)
        //             q.add(t.right);

        //         s--;
        //     }
        // }
        // return root;
        traversal(root);
        return root;
    }
    public void traversal(Node curr) {
        if(curr == null)
            return;
        if (curr.left != null) {
            curr.left.next = curr.right;
        }
        if (curr.right != null && curr.next != null) {
            curr.right.next = curr.next.left;
        }
        if (curr.left != null) traversal(curr.left);
        if (curr.right != null) traversal(curr.right);
    }
}