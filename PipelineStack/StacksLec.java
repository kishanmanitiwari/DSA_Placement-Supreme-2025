import java.util.ArrayList;
import java.util.Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class StackClassUsingLinkedList {
    Node head;

    void push(int val) {
        // crate a new node and its next will point to prevous node
        Node curr = new Node(val);
        curr.next = head; // points to previous node
        head = curr; // update top

    }

    int pop() {
        // return the head and head becomes the previous node
        // stack empty
        if (head == null) {
            throw new RuntimeException("Bhai, Stack is empty");
        }

        // not empty
        int top = head.val;
        head = head.next;

        return top;
    }

    int peek() {
        // stack empty
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }

        // not empty
        int top = head.val;
        return top;
    }

    boolean isEmpty() {
        return head == null;
    }
}

class StackClassUsingArrayList {
    ArrayList<Integer> al = new ArrayList<>();
    int top = al.size() - 1; // last element

    void push(int val) {
        al.add(val);
        top = al.size() - 1;
    }

    int pop() {
        if (al.isEmpty()) {
            throw new RuntimeException("Bhai, Stack is empty");
        }
        int peekElement = al.get(top);
        al.remove(top);
        top = al.size() - 1;
        return peekElement;
    }

    int peek() {
        if (al.isEmpty()) {
            throw new RuntimeException("Bhai, Stack is empty");

        }
        int peekElement = al.get(top);
        return peekElement;
    }

    boolean isEmpty() {
        return al.isEmpty();
    }
}

public class StacksLec {
    public static void main(String[] args) {
        // StackClassUsingLinkedList stack = new StackClassUsingLinkedList();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


        // StackClassUsingArrayList stack = new StackClassUsingArrayList();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Stack<String> stack = new Stack<>();
        stack.push("Rohan");
        stack.push("Khushi");
        stack.push("Mohan");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
      

    }
}
