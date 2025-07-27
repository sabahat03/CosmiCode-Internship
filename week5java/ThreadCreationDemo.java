// File: ThreadCreationDemo.java
// Task 1: Thread Creation using Thread and Runnable

 class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class: " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface: " + Thread.currentThread().getName());
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        // Using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Using Runnable interface
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
