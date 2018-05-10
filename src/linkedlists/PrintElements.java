package linkedlists;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintElements {

    static void Print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static void ReversePrint(Node head) {
        Deque<Integer> queue = new ArrayDeque<>();

        while (head != null) {
            queue.push(head.data);
            head = head.next;
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 5;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 4;
        head.next.next.next = null;

        Print(head);
        ReversePrint(head);
    }

}
