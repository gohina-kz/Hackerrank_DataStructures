package linkedlists;

public class InsertNodeAtSpecificPosition {

    static Node InsertNth(Node head, int num, int position) {

        Node newNode = new Node();
        newNode.data = num;

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {

            int counter = 0;
            Node runner = head;
            while (position - counter != 1) {
                runner = runner.next;
                counter++;
            }

            Node temp = runner.next;
            runner.next = newNode;
            newNode.next = temp;
        }

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
        PrintElements.Print(InsertNth(head, 6, 0));
        PrintElements.Print(InsertNth(head, 6, 1));
    }
}
