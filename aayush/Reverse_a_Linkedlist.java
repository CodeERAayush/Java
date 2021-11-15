
class Node {
    int data;
    Node node;
    public Node next;

    Node(int val) {
        this.data = val;
    }
}

public class Reverse_a_Linkedlist {
    public static void main(String[] args) {
        int i;
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        rev(head);

    }

    // reversing a linked list using iteration method!

    public static Node reverse(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node cur = temp.next;
            temp.next = prev;
            prev = temp;
            temp = cur;
        }
        return prev;

    }

    // reversing a linked list using recursion!

    public static Node rev(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = rev(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

}
