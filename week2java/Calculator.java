// Task 5: Simple Calculator(switch-case & methods)
import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return b != 0 ? a / b : Double.NaN; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = add(x, y); break;
            case '-': result = subtract(x, y); break;
            case '*': result = multiply(x, y); break;
            case '/': result = divide(x, y); break;
            default: System.out.println("Invalid operation."); return;
        }
        System.out.println("Result: " + result);
    }
}