package Stacks;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

//Array - ArrayList - LinkedList - ADT

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
        Node curr = new Node(val);
        curr.next = head; // Link to previous top
        head = curr; // Update top
    }

    int pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        int topVal = head.val;
        head = head.next; // Remove the top node
        return topVal;
    }

    int peek() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        return head.val;
    }

    boolean isEmpty() {
        return head == null;
    }
}

class StackUsingArrayList {
    ArrayList<Integer> stack = new ArrayList<>();
    int head = stack.size() - 1;

    void push(int val) {
        stack.add(val);
        head = stack.size() - 1;
    }

    int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        int removed = stack.remove(head);
        head = stack.size() - 1;
        return removed;
    }

    int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        return stack.get(head);
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

}

public class Stacks {
    public static void main(String[] args) {
        // StackUsingArrayList stack = new StackUsingArrayList();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
    

        //push at bootom of stack

        pushAtBottom(stack,101);

        reverseStack(stack);

    }

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        //recursive case
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    private static void pushAtBottom(Stack<Integer> stack, int val) {
            //recursion
            
            if (stack.isEmpty()) {
                stack.push(val);
                return;
            }

            //recursive case 
            //do some work

            int top = stack.pop();
            pushAtBottom(stack, val);
            stack.push(top);
    }

}
