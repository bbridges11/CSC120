import java.util.*;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<String> str) {
        if(str.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("%s TOP%n", str);
        }
    }
}