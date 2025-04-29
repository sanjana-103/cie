public class SimpleCalculator1 {
    public static void main(String[] args) {
    
        int a = 10;  
        int b = 5;   
        char op = '+';

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
