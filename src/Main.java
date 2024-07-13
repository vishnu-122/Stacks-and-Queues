import java.util.Scanner;

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

        //creating RPN calaculator which works on stack as well
        Stack<Double> stack = new Stack<>();
        try {
            Scanner sin = new Scanner(System.in);
            System.out.print("Enter Expression: ");
            while (sin.hasNextLine()) {
                String expression = sin.nextLine();
                for (String token : expression.split(" ")) {
                    System.out.print(token + "\t\t");
                    switch (token) {
                        case "+":
                            System.out.println("Adding top two elements\t\t");
                            stack.push(stack.pop() + stack.pop());
                            break;
                        default:
                            System.out.println("Pushing " + token);
                            stack.push(Double.parseDouble(token));
                    }
                    System.out.println(stack); // Uses toString to see Stack
                }
                System.out.print("Enter Expression: ");
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}