// Task 3: Array Sum and Average
import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = sum / 5.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}