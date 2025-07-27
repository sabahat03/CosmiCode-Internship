// Task 1: File: AddressBookGUI.java

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " | " + phone + " | " + email;
    }
}

public class AddressBookGUI extends JFrame {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private JTextField nameField, phoneField, emailField;
    private JTextArea displayArea;

    public AddressBookGUI() {
        setTitle("Address Book");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Phone:"));
        phoneField = new JTextField(15);
        add(phoneField);

        add(new JLabel("Email:"));
        emailField = new JTextField(15);
        add(emailField);

        JButton addBtn = new JButton("Add");
        JButton showBtn = new JButton("Show Contacts");
        add(addBtn);
        add(showBtn);

        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        // Add Contact Button Action
        addBtn.addActionListener(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            if (!name.isEmpty() && !phone.isEmpty() && !email.isEmpty()) {
                contacts.add(new Contact(name, phone, email));
                displayArea.append("Added: " + name + "\n");
                nameField.setText("");
                phoneField.setText("");
                emailField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Fill all fields!");
            }
        });

        // Show Contacts Button Action
        showBtn.addActionListener(e -> {
            displayArea.setText("");
            for (Contact c : contacts) {
                displayArea.append(c.toString() + "\n");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AddressBookGUI();
    }
}
