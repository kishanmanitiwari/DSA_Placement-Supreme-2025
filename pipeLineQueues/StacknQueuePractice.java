import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;




class MinStack {
    private Stack<Integer> originalStack;
    private Stack<Integer> minStack;

    public MinStack() {
        originalStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        originalStack.push(val);
        // Only push to minStack if it's empty or val is <= current min
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int popped = originalStack.pop();
        // If the popped value is the current min, pop from minStack too
        if (!minStack.isEmpty() && popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return originalStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}


class RecentCounter {
    Queue<Integer> q;
    //[[], [1], [100], [3001], [3002]]
    public RecentCounter() {
        q =  new ArrayDeque<>();
    }
    
    public int ping(int time) {
        //last 3 second number of calls
        q.offer(time);
        //q ke top aisa element hai jo >3sec pop
        //[1,2,3,4]
        while (q.peek() < time-3000) {
            q.poll();
        }

        return q.size();
    }
}


public class StacknQueuePractice {

    public boolean isValid(String s) {
        // Stack
        Stack<Character> stack = new Stack<>();

        // step 1 - opening - push

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                // closing bracket
                // peekBracket == bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char peekBracket = stack.pop();
                if ((bracket == ']' && peekBracket != '[')
                        || (bracket == ')' && peekBracket != '(') ||
                        (bracket == '}' && peekBracket != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        StacknQueuePractice leetcode = new StacknQueuePractice();
        System.out.println(leetcode.isValid("({{{{}}}))"));

    }
}
