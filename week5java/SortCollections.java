// Task 5: Sort Elements in ArrayList and HashSet
// File: SortCollections.java

import java.util.*;

public class SortCollections {
    public static void main(String[] args) {
        // ArrayList Sorting
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 9, 1, 7));
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        // HashSet Sorting
        HashSet<Integer> set = new HashSet<>(Arrays.asList(12, 4, 8, 2, 10));
        ArrayList<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        System.out.println("Sorted HashSet: " + sortedList);
    }
}
