package stack;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args)
    {
        Stack<String> stack=new Stack<>();

        stack.push("rice");
        stack.push("roti");
        stack.push("dal");
        System.out.println("item are\n" + stack);
        System.out.println("item at top\n" + stack.peek());
        stack.pop();
        System.out.println("item at top\n" + stack.peek());
        stack.pop();
        System.out.println("item at top\n" + stack.peek());
    }
}