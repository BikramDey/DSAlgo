class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    int size = 0;
    public MyStack() {
        
    }
    
    public void push(int x) {
        int temp = size;
        q1.offer(x);
        while(temp-->0){
            q1.offer(q1.poll());
        }
        size++;
    }
    
    public int pop() {
        size--;
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */