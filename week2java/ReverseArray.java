// Task 4: Reverse Array Elements
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        System.out.print("Reversed: ");
        for (int i = 4; i >= 0; i--) System.out.print(arr[i] + " ");
    }
}