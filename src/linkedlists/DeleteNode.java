package linkedlists;

public class DeleteNode {

    static Node delete(Node head, int position) {

        if (head == null) {
            return head;
        }

        if (position == 0) {
            return head.next;
        }

        Node runner = head;

        int counter = 0;

        while (position - counter != 1) {
            runner = runner.next;
            counter++;
        }

        runner.next = runner.next.next;


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
        PrintElements.Print(delete(head, 2));

        PrintElements.Print(delete(null, 0));
    }
}
