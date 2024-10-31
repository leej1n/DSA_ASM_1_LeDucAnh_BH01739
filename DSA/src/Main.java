import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(22);
        stack.push(12);
        stack.push(99);
        stack.push(4);
        stack.push(7);
        stack.push(54);
        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

        int top = stack.peek();
        System.out.println(top);

        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty);
    }
}
