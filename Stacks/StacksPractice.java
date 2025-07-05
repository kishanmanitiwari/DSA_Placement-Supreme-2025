package Stacks;
import java.util.Stack;

public class StacksPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        // pushAtBottom(stack, 40);
        // stack.push(50);
        System.out.println("Before reversing " + stack);
        reverseStack(stack);
        System.out.println("After reversing " + stack);
    }

    private static void reverseStack(Stack<Integer> stack) {
        //top ko nikalo bottom me dalo
        //asia sabke liye karo

        if (stack.isEmpty()) {
            return;
        }

        //recerusive case + kaam
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    private static void pushAtBottom(Stack<Integer> stack, int val) {
        //sabko nikalo
        //value - add
        //phir sabko add karo
        if (stack.isEmpty()) {
            //base case
            stack.push(val);
            return;
        }

        //recursive//word
        int top = stack.pop();
        pushAtBottom(stack, val);
        stack.add(top);
    }

}
