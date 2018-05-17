package linkedlists;

public class MergeTwoSortedLinkedLists {

    static Node merge(Node A, Node B) {

        if (A == null && B == null) {
            return null;
        } else if (A == null) {
            return B;
        } else if (B == null) {
            return A;
        }

        Node C;

        if (A.data < B.data) {
            C = A;
            C.next = merge(A.next, B);
        } else {
            C = B;
            C.next = merge(A, B.next);
        }

        return C;

    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 2;
        head.next = new Node();
        head.next.data = 4;
        head.next.next = new Node();
        head.next.next.data = 5;
        head.next.next.next = null;

        Node head2 = new Node();
        head2.data = 1;
        head2.next = new Node();
        head2.next.data = 3;
        head2.next.next = new Node();
        head2.next.next.data = 9;
        head2.next.next.next = null;


        PrintElements.Print(merge(head, head2));
    }
}
