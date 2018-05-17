package linkedlists;

public class GetNodeValue {

    // position from tail
    static Integer getValue(Node head, int position) {

        Node p1 = head;
        Node p2 = head;
        int counter = 0;

        while (p1.next != null && counter < position) {
            p1 = p1.next;
            counter++;
        }

        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2 != null ? p2.data : null;

    }

    public static void main(String[] args) {
        Node head1 = new Node();
        head1.data = 5;
        head1.next = new Node();
        head1.next.data = 2;
        head1.next.next = new Node();
        head1.next.next.data = 8;
        head1.next.next.next = null;

        System.out.println(getValue(head1, 0));
        System.out.println(getValue(head1, 5));
    }

}
