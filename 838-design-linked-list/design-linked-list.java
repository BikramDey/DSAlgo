class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        if(size == 0 || index > size-1){
            return -1;
        }
        int i = 0;
        Node temp = head;
        while(i<index){
            temp = temp.next;
            i++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        if(size == 0){
            head = new Node(val);
            size++;
            return;
        }
        int i = 0;
        Node temp = head;
        while(i<size-1){
            temp = temp.next;
            i++;
        }
        temp.next = new Node(val);
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == 0){
            addAtTail(val);
            return;
        }
        int i = 0;
        Node temp = head;
        while(i<index-1 && i<size-1){
            temp = temp.next;
            i++;
        }
        Node temp2 = temp.next;
        temp.next = new Node(val);
        temp.next.next = temp2;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        int i = 0;
        Node temp = head;
        while(i<index-1){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
        size--;
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