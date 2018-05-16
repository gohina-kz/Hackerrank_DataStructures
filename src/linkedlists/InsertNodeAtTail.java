package linkedlists;

public class InsertNodeAtTail {

    static Node insert(Node head, int num) {

        Node newNode = new Node();
        newNode.data = num;

        if (head == null) return newNode;

        Node runner = head;

        while (runner.next != null) {
            runner = runner.next;
        }

        runner.next = newNode;

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
        PrintElements.Print(insert(head, 3));
        PrintElements.Print(insert(null, 6));
    }

}
