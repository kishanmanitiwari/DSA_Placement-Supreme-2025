package pipeLineQueues;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class QueuesUsingArray {
    // push - offer
    // peek
    // poll - remove

    int[] arr;
    int size; // total capacity
    int back = -1;

    QueuesUsingArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    boolean offer(int data) {
        if (back == size - 1) {
            System.out.println("Queue is full");
            return false;
        }
        back++;
        arr[back] = data;
        return true;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    int poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        // Shift all elements to left
        for (int i = 1; i <= back; i++) {
            arr[i - 1] = arr[i];
        }
        back--;
        return front;
    }

    boolean isEmpty() {
        return back == -1;
    }
}

class CircularQueuesUsingArray {
    int[] arr;
    int size;
    int rear = -1;
    int front = -1;

    CircularQueuesUsingArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    boolean offer(int val) {
        if (isFull()) {
            System.out.println("Queue Full");
            return false;
        }

        if (front == -1) {
            front = 0; // first element
        }

        rear = (rear + 1) % size;
        arr[rear] = val;
        return true;
    }

    int poll() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int result = arr[front];
        if (rear == front) {
            rear = front = -1; // only one element
        } else {
            front = (front + 1) % size;
        }

        return result;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }
}

class QueueUsingLinkedList {
    Node rear; // insert
    Node front; // first out

    void offer(int val) {
        // 2 case
        // quee - emepty - first
        // que - not empty

        Node curr = new Node(val);
        if (isEmpty()) {
            front = curr;
            rear = curr;
        } else {
            // not empty
            rear.next = curr;
            rear = curr;
        }

    }

    int poll() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int result = front.val;
        front = front.next;

        if (front == null) {
            rear = null; // queue becomes empty
        }

        return result;
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.val;
    }

    boolean isEmpty() {
        return rear == null;
    }

}
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        shiftStacks();
        if (stack2.isEmpty()) {
            throw new RuntimeException("stack is empty");
        } else {
            return stack2.pop();
        }
    }

    public int peek() {
        shiftStacks();
        if (stack2.isEmpty()) {
            throw new RuntimeException("stack is empty");
        } else {
            return stack2.peek();
        }
    }

    private void shiftStacks() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}


public class QueuesLecSelf {
    public static void main(String[] args) {

        // CircularQueuesUsingArray cq = new CircularQueuesUsingArray(5);

        // cq.offer(1);
        // cq.offer(2);
        // cq.offer(3);
        // cq.offer(4);
        // cq.offer(5);
        // System.out.println(cq.poll());
        // cq.offer(6);
        // System.out.println(cq.peek());

        // while (!cq.isEmpty()) {
        // System.out.println(cq.poll());
        // }

        // QueueUsingLinkedList queue = new QueueUsingLinkedList();

        // // Test offer
        // queue.offer(10);
        // queue.offer(20);
        // queue.offer(30);

        // // Test peek
        // System.out.println("Peek: " + queue.peek()); // should be 10

        // // Test poll
        // System.out.println("Poll: " + queue.poll()); // should be 10
        // System.out.println("Poll: " + queue.poll()); // should be 20

        // // Test peek again
        // System.out.println("Peek: " + queue.peek()); // should be 30

        // // Poll the last element
        // System.out.println("Poll: " + queue.poll()); // should be 30

        // // Now queue is empty, next peek/poll should throw exception
        // try {
        // System.out.println("Peek: " + queue.peek());
        // } catch (RuntimeException e) {
        // System.out.println("Exception on peek: " + e.getMessage());
        // }

        // try {
        // System.out.println("Poll: " + queue.poll());
        // } catch (RuntimeException e) {
        // System.out.println("Exception on poll: " + e.getMessage());
        // }
        // }

        // Queue<Integer> q = new LinkedList<>();

        // Queue<Integer> q = new ArrayDeque<>();

        // queue - linkedlist - cache diffrence

    }
}