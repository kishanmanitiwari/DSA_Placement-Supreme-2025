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

class QueueUsingArray {
    int[] arr;
    int front;
    int rear;
    int capacity;

    QueueUsingArray(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    boolean offer(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return false;
        }

        rear++;
        arr[rear] = value;
        return true;
    }

    int poll() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return arr[front++];
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return arr[front];
    }

    boolean isEmpty() {
        return front > rear;
    }
}

class CircularQueueUsingArray {
    private int[] arr;
    int front;
    int rear;
    int size;

    CircularQueueUsingArray(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    boolean offer(int val) {
        // 1 case - queues - full
        // 2 case - queue
        if (((rear + 1) % size) == front) {
            System.out.println("Stack is full");
            return false;
        }

        // first time
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = val;
        return true;

    }

    int poll() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        int result = arr[front];

        if (front == rear) {
            front = rear = -1; // only 1 eleemnt
        } else {
            front = (front + 1) % size; // circle to start
        }

        return result;
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        int result = arr[front];

        return result;
    }

    boolean isEmpty() {
        return front == -1;
    }
}

class QueueUsingLinkedList {
    Node front;
    Node rear;

    void offer(int val) {
        // 2 case -
        Node curr = new Node(val);
        if (rear == null) {
            // first time
            rear = front = curr;
        } else {
            rear.next = curr;
            rear = curr;
            // when we have something
        }

    }

    int poll() {
        // 2 case - Q - empty
        // 2 case - Q empty nahi hai

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int removedValue = front.val;

        front = front.next;

        return removedValue;

    }

    int peek() {
        // 2 case - Q - empty
        // 2 case - Q empty nahi hai

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return front.val;

    }

    boolean isEmpty() {
        return front == null;
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
        shiftStack();
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is emmpty");
        }
        return stack2.pop();
    }

    public int peek() {
        shiftStack();
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is emmpty");
        }
        return stack2.peek();
    }

    private void shiftStack() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                int removeValue = stack1.pop();
                stack2.push(removeValue);
            }
        }
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class QueuesLec {
    public static void main(String[] args) {
        // QueueUsingArray q = new QueueUsingArray(5);
        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // q.offer(40);
        // System.out.println(q.poll()); //10
        // System.out.println(q.peek()); //20
        // System.out.println(q.isEmpty());//false

        // CircularQueueUsingArray q = new CircularQueueUsingArray(5);
        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // q.offer(40);
        // System.out.println(q.poll()); // 10
        // q.offer(50);
        // q.offer(60);
        // System.out.println(q.peek());
        // System.out.println(q.isEmpty());// false

        // while (!q.isEmpty()) {
        // System.out.println(q.poll());
        // }

        // QueueUsingLinkedList q = new QueueUsingLinkedList();
        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // q.offer(40);
        // System.out.println(q.poll()); // 10
        // System.out.println(q.peek()); //20
        // System.out.println(q.isEmpty());// false

        // Queue<Integer> q = new LinkedList<>();
        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // q.offer(40);
        // System.out.println(q.poll()); // 10
        // System.out.println(q.peek()); // 20
        // System.out.println(q.isEmpty());// false

        // Queue<Integer> q2 = new ArrayDeque<>(); //recommed - stack/q
        // q2.offer(10);
        // q2.offer(20);
        // q2.offer(30);
        // q2.offer(40);
        // System.out.println(q2.poll()); // 10
        // System.out.println(q2.peek()); // 20
        // System.out.println(q2.isEmpty());// false

    }
}
