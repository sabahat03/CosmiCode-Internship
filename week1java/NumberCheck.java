// NumberCheck.java
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if-else
        if (num > 0)
            System.out.println("Number is positive (if-else)");
        else if (num < 0)
            System.out.println("Number is negative (if-else)");
        else
            System.out.println("Number is zero (if-else)");

        // Using switch-case
        switch (Integer.signum(num)) {
            case 1:
                System.out.println("Number is positive (switch-case)");
                break;
            case -1:
                System.out.println("Number is negative (switch-case)");
                break;
            case 0:
                System.out.println("Number is zero (switch-case)");
                break;
        }
    }
}