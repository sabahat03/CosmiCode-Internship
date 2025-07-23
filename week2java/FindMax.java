// Task 1: Maximum of Three Numbers (using a method)
import java.util.Scanner;

public class FindMax {
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        System.out.println("Maximum: " + maxOfThree(x, y, z));
    }
}