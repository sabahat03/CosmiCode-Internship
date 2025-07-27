// Task 3: Library SYSTEM
// File: LibraryGUI.java

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class Book {
    int id;
    String title, author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return id + " | " + title + " | " + author;
    }
}

public class LibraryGUI extends JFrame {
    private ArrayList<Book> books = new ArrayList<>();
    private JTextField idField, titleField, authorField;
    private JTextArea displayArea;

    public LibraryGUI() {
        setTitle("Library Management");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("ID:"));
        idField = new JTextField(5);
        add(idField);

        add(new JLabel("Title:"));
        titleField = new JTextField(10);
        add(titleField);

        add(new JLabel("Author:"));
        authorField = new JTextField(10);
        add(authorField);

        JButton addBtn = new JButton("Add Book");
        JButton viewBtn = new JButton("View Books");
        add(addBtn);
        add(viewBtn);

        displayArea = new JTextArea(15, 40);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        addBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String title = titleField.getText();
            String author = authorField.getText();
            books.add(new Book(id, title, author));
            JOptionPane.showMessageDialog(this, "Book Added!");
            idField.setText("");
            titleField.setText("");
            authorField.setText("");
        });

        viewBtn.addActionListener(e -> {
            displayArea.setText("");
            for (Book b : books) {
                displayArea.append(b.toString() + "\n");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LibraryGUI();
    }
}
