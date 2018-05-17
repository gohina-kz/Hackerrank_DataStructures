package linkedlists;

public class ReverseLinkedList {

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node();
        head.data = 5;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 8;
        head.next.next.next = null;

        PrintElements.Print(reverse(head));
    }

}
