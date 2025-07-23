// Task 3: WelcomeUser.java
import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");
    }
}