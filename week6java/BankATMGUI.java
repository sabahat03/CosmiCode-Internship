// Task 4: Bank ATM Simulation GUI
// File: BankATMGUI.java

import java.awt.*;
import javax.swing.*;

public class BankATMGUI extends JFrame {
    private double balance = 5000.0;
    private final String PIN = "1234";

    public BankATMGUI() {
        setTitle("ATM Simulation");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPasswordField pinField = new JPasswordField(10);
        JButton loginBtn = new JButton("Login");
        add(new JLabel("Enter PIN:"));
        add(pinField);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            String enteredPin = new String(pinField.getPassword());
            if (enteredPin.equals(PIN)) {
                showATMMenu();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid PIN!");
            }
        });

        setVisible(true);
    }

    private void showATMMenu() {
        JFrame menuFrame = new JFrame("ATM Menu");
        menuFrame.setSize(400, 300);
        menuFrame.setLayout(new FlowLayout());

        JButton checkBalance = new JButton("Check Balance");
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton exitBtn = new JButton("Exit");

        menuFrame.add(checkBalance);
        menuFrame.add(depositBtn);
        menuFrame.add(withdrawBtn);
        menuFrame.add(exitBtn);

        checkBalance.addActionListener(e -> JOptionPane.showMessageDialog(menuFrame, "Balance: " + balance));

        depositBtn.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog("Enter deposit amount:");
            if (amountStr != null) {
                balance += Double.parseDouble(amountStr);
                JOptionPane.showMessageDialog(menuFrame, "Deposit successful!");
            }
        });

        withdrawBtn.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog("Enter withdrawal amount:");
            if (amountStr != null) {
                double amount = Double.parseDouble(amountStr);
                if (amount <= balance) {
                    balance -= amount;
                    JOptionPane.showMessageDialog(menuFrame, "Withdrawal successful!");
                } else {
                    JOptionPane.showMessageDialog(menuFrame, "Insufficient balance!");
                }
            }
        });

        exitBtn.addActionListener(e -> System.exit(0));

        menuFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new BankATMGUI();
    }
}
