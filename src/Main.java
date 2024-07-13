//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);

        System.out.println("Stack: " + newStack);
        System.out.println("Top element: "+ newStack.peek());
        System.out.println("popped Element: " + newStack.pop());
        System.out.println("Stack after pop: " + newStack);
    }
}