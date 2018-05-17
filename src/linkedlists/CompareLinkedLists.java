package linkedlists;

public class CompareLinkedLists {

    static int compare(Node A, Node B) {

        while (A != null && B != null) {
            if (A.data != B.data) {
                return 0;
            }
            A = A.next;
            B = B.next;
        }

        if (A == null && B == null) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Node head1 = new Node();
        head1.data = 5;
        head1.next = new Node();
        head1.next.data = 2;
        head1.next.next = new Node();
        head1.next.next.data = 8;
        head1.next.next.next = null;

        Node head2 = new Node();
        head2.data = 5;
        head2.next = new Node();
        head2.next.data = 2;
        head2.next.next = new Node();
        head2.next.next.data = 8;
        head2.next.next.next = null;


        Node head3 = new Node();
        head3.data = 5;
        head3.next = new Node();
        head3.next.data = 3;
        head3.next.next = new Node();
        head3.next.next.data = 5;
        head3.next.next.next = null;



        System.out.println(compare(head1, head2));
        System.out.println(compare(head1, head3));;
    }
}
