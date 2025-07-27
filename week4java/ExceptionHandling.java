// Task 4: Handle ArithmeticException & ArrayIndexOutOfBoundsException

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // Division by zero
            int result = a / b;
            System.out.println("Result: " + result);

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Out of bounds

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: Invalid index accessed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
