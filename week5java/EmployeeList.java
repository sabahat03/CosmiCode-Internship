// Task 4: Use ArrayList to Store and Display Employee Names

// File: EmployeeList.java
import java.util.ArrayList;

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ahmed");
        employees.add("Fatima");
        employees.add("Hassan");
        employees.add("Ayesha");
        employees.add("Bilal");
        employees.add("Sana");
        employees.add("Ali");
        employees.add("Zainab");
        employees.add("Usman");
        employees.add("Hira");

        System.out.println("Employee Names:");
        for (String name : employees) {
            System.out.println(name);
        }
    }
}
