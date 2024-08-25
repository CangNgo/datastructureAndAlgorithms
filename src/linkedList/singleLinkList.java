package linkedList;

public class singleLinkList {
    // tạo khởi tạo node
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node PrintLinkList(Node headNode) {
        Node head = headNode;
        if (head.next == null) {
            return head;
        }
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
        return head;
    }
    // public static class Node

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        System.out.println(PrintLinkList(n1));
    }
}
