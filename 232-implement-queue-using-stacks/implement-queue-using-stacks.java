class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        // push:   amortized O(1), worst O(n), Best O(1)
        if(st1.isEmpty()){     //Best O(1)
            st1.push(x);
            return;
        }
        while (!st1.isEmpty()) {      //Worst O(1)
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */