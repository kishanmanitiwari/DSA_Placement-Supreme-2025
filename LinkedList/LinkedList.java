import PipelineStack.Node;

public class LinkedList {
    Node head;

    LinkedList(Node head) {
        this.head = head;
    }

    Node DeleteNode(Node head, int val) {
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

    Node InsetAtBeginning(Node head, int data) {
        // 1) Create a new Node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    Node InsetAtEnd(Node head, int data) {

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
    void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            // till its not null
            System.out.print(temp.data + "-->");

            temp = temp.next;
        }
        System.out.println("null");

    }

    Node reverseList(Node head) {
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

    Node findMiddle(Node head) {
        Node kunal = head;
        Node vd = head;

        while (vd.next != null && vd.next.next != null) {
            kunal = kunal.next;
            vd = vd.next.next;
        }

        return kunal;
    }

    boolean search(Node head, int target) {
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

    int countNodes(Node head) {
        if (head == null) {
            return 0;
            // base case
        } else {
            return 1 + countNodes(head.next);

        }

    }

}

