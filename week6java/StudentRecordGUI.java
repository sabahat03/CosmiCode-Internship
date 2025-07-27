// Task 5: 5. Student Record Management 
//File: StudentRecordGUI.java

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " | " + name + " | " + marks;
    }
}

public class StudentRecordGUI extends JFrame {
    private ArrayList<Student> students = new ArrayList<>();
    private JTextField idField, nameField, marksField;
    private JTextArea displayArea;

    public StudentRecordGUI() {
        setTitle("Student Record Management");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("ID:"));
        idField = new JTextField(5);
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField(10);
        add(nameField);

        add(new JLabel("Marks:"));
        marksField = new JTextField(5);
        add(marksField);

        JButton addBtn = new JButton("Add Student");
        JButton viewBtn = new JButton("View Students");
        add(addBtn);
        add(viewBtn);

        displayArea = new JTextArea(15, 40);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        addBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            double marks = Double.parseDouble(marksField.getText());
            students.add(new Student(id, name, marks));
            JOptionPane.showMessageDialog(this, "Student Added!");
            idField.setText("");
            nameField.setText("");
            marksField.setText("");
        });

        viewBtn.addActionListener(e -> {
            displayArea.setText("");
            for (Student s : students) {
                displayArea.append(s.toString() + "\n");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRecordGUI();
    }
}
