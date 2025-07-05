import Stacks.Node;

class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;

        // System.out.println("Before Inserting");

        // printLinkedList(head);

        // System.out.println("After Inserting");

        // head = InsetAtBeginning(head, 5);
        // printLinkedList(head);

        // System.out.println("After Inserting at End");
        // head = InsetAtEnd(head, 40);
        // printLinkedList(head);

        // System.out.println("After Deleting");
        // head = DeleteNode(head, 30);
        // printLinkedList(head);

        // System.out.println("Before Reversing");
        // printLinkedList(head);
        // System.out.println("After Reversing");
        // head = reverseList(head);
        printLinkedList(head);
        // Node middleNode = findMiddle(head);
        // System.out.println("The middle node is " + middleNode.data);
        // boolean isNodePresent = search(head, 40);
        // System.out.println("The target is peresent (T/F) " + isNodePresent);

        int numberOfNodes = countNodes(head);
        System.out.println("Total number of nodes are " + numberOfNodes);

    }

    static Node DeleteNode(Node head, int val) {
        // Edge case
        if (head == null)
            return null;
        if (head.data == val)
            return head.next;

        // Trvaverse before the node to be deleted
        Node temp = head;

        while (temp.next.data != val) {

            temp = temp.next;
        }

        // Step 2: temp.next - temp.next.next

        temp.next = temp.next.next;

        return head;
    }

    static Node InsetAtBeginning(Node head, int data) {
        // 1) Create a new Node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node InsetAtEnd(Node head, int data) {

        // Step1 : Create new Node
        Node newNode = new Node(data);
        if (head == null)
            return newNode;

        // Step 2: last node traverse
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // Point last node to newNode
        temp.next = newNode;

        return head;

    }

    // print - traverse
    static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            // till its not null
            System.out.print(temp.data + "-->");

            temp = temp.next;
        }
        System.out.println("null");

    }

    static Node reverseList(Node head) {
        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    static Node findMiddle(Node head) {
        Node kunal = head;
        Node vd = head;

        while (vd.next != null && vd.next.next != null) {
            kunal = kunal.next;
            vd = vd.next.next;
        }

        return kunal;
    }

    static boolean search(Node head, int target) {
        Node temp = head;

        // traversal
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }

        return false;

    }

    static int countNodes(Node head) {
        if (head == null) {
            return 0;
            // base case
        } else {
            return 1 + countNodes(head.next);

        }

    }

}
