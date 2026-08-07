package CollectionsFramework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(10);
        ll.add(2,0);
        System.out.println(ll);

        // We can implement linked list using Queue interface and its implemented class as well
        Deque<Integer> queue = new LinkedList<>();
        // Beacuse
        // 1.A Queue follows  FIFO  just like Linkedlist
        //2. And Deque<E> extends Queue<E> , LinkedList automatically becomes a valid Queue implementation too. because linked list extends deque
        // 3. Because of queue, no traversal needed. it can directly access to both head and tail.
        //4.This works structurally because LinkedList's doubly-linked-node design can efficiently support both Queue's FIFO operations and Deque's double-ended operations using the same underlying head/tail references.



        //1. linked list allows duplicate and it follows insertion order

        //2. linked list does not follow indexing(no direct access) because linked list internally hasno array-like memory layout, but it can still use index positions" (logically/conceptually)
        // How ll.add(2, 0) actually achieves this:
        //Java doesn't jump to index 2 directly (no direct access).
        //Instead, it traverses node-by-node from the head (or tail) until it counts its way to position 2.
        //Once it reaches that node, it inserts the new node there by relinking pointers.

        //3. Yes — a linked list is growable (dynamic) in nature. But it does not have initial capacity  like ArrayList To grow the list, you just create a new node and link it in — no need to resize or copy the whole structure like you would with a static array.This makes insertion and deletion efficient (O(1) at a known position) and the size can grow or shrink dynamically at runtime.
        // 4. Linkedlist Internally structure double linked list

        // why linkedList implements Deque?
        // LinkedList implements Deque because its underlying structure — a doubly linked list — naturally supports efficient insertion and removal at both ends (front and back), which is exactly what a Deque (Double-Ended Queue) requires.


    }
}
