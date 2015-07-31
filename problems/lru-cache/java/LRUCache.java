import java.util.*;
public class LRUCache {
    static class LinkedNode {
        int key;
        int value;
        LinkedNode next, prev;
        LinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    int capacity, size;
    LinkedNode head, tail;
    Map<Integer, LinkedNode> map = new HashMap<Integer, LinkedNode>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new LinkedNode(-1, -1);
        tail = new LinkedNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        LinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        use(node);
        return node.value;
    }
    
    public void set(int key, int value) {
        LinkedNode node = map.get(key);
        if (node != null) {
            node.value = value;
            use(node);
        } else {
            if (size == capacity) {
                LinkedNode toRemove = tail.prev;
                map.put(toRemove.key, null);
                tail.prev = toRemove.prev;
                tail.prev.next = tail;
                toRemove.next = toRemove.prev = null;
            } else {
                size++;
            }

            node = new LinkedNode(key, value);
            map.put(key, node);
            node.next = head.next;
            node.next.prev = node;
            node.prev = head;
            head.next = node;
        }
    }

    void use(LinkedNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }
}
