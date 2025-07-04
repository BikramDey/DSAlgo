class MyLinkedList {
    private Node head;
    private int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size)
            return -1;

        Node temp = head;
        for(int i = 0; i<index; i++)
            temp = temp.next;

        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    
    public void addAtTail(int val) {
        
        Node temp1 = new Node(val);
        if(head == null){
            head = temp1;
        }
        else{
            Node temp2 = head;
            while(temp2.next!=null){
                temp2 = temp2.next;
            }
            temp2.next = temp1;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size)
            return;

        if(index==0)
            addAtHead(val);
        else if(index==size)
            addAtTail(val);
        else{
            Node temp = head;
            Node node = new Node(val);
            for(int i = 0; i<index-1; i++)
                temp = temp.next;

            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)
            return;

        if(index==0){
            head = head.next;
            size--;
            return;
        }
        else{
            Node temp = head;
            for(int i = 0; i<index-1; i++)
                temp = temp.next;

            temp.next = temp.next.next;
            size--;
        }
    }
    private class Node{
        int val;
        Node next;
        public Node(int v){
            this.val = v;
            this.next = null;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */