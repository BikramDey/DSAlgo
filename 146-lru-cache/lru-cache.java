class LRUCache {
    int capacity;
    HashMap<Integer, DoublyLinkedNode> map;
    DoublyLinkedNode head;
    DoublyLinkedNode tail;
    int size;
    public LRUCache(int c) {
        capacity = c;
        size = 0;
        map = new HashMap<>();
        head = new DoublyLinkedNode(0, 0);
        tail = new DoublyLinkedNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        DoublyLinkedNode node = map.get(key);
        moveToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            DoublyLinkedNode node = map.get(key);
            node.val = value;
            moveToHead(node);
        }else{
            DoublyLinkedNode node = new DoublyLinkedNode(key, value);
            map.put(key, node);
            addToHead(node);
            size++;
            if (size > capacity) {
                DoublyLinkedNode tail = removeTail();
                map.remove(tail.key);
                size--;
            }
        }
    }
    private void moveToHead(DoublyLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }
    private void removeNode(DoublyLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void addToHead(DoublyLinkedNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    private DoublyLinkedNode removeTail() {
        DoublyLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}
class DoublyLinkedNode{
    int key;
    int val;
    DoublyLinkedNode next;
    DoublyLinkedNode prev;
    public DoublyLinkedNode(int k, int v){
        key = k;
        val = v;
        next = null;
        prev = null;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */