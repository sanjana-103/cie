import java.util.Scanner;

public class SimpleCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Arithmetic Calculator");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0);

        int result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return;
            }
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("Result: " + result);
    }
}
