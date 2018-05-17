package linkedlists;

public class DeleteDuplicateValueNodesFromSortedLinkedList {

    static Node delete(Node head) {

        Node runner = head;

        while (runner.next != null) {
            if (runner.data == runner.next.data) {
                runner.next = runner.next.next;
            } else {
                runner = runner.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        head.next = new Node();
        head.next.data = 1;
        head.next.next = new Node();
        head.next.next.data = 1;
        head.next.next.next = null;
        PrintElements.Print(delete(head));
    }

}
