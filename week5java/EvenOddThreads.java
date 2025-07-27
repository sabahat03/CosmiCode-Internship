// File: EvenOddThreads.java
// Task 2: Two Threads — Even and Odd Numbers

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}
