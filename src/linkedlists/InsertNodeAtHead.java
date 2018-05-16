package linkedlists;

public class InsertNodeAtHead {

    static Node insert(Node head, int data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        return head;

    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 5;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 4;
        head.next.next.next = null;
        PrintElements.Print(insert(head, 6));
    }

}
