// Task 2: File: QuizAppGUI.java

import java.awt.*;
import javax.swing.*;

public class QuizAppGUI extends JFrame {
    private String[] questions = {
        "What is the capital of Pakistan?",
        "Which language is WORA?",
        "What is 5 + 7?",
        "Who invented Java?",
        "Which collection allows duplicates?"
    };

    private String[][] options = {
        {"Lahore", "Karachi", "Islamabad"},
        {"C++", "Java", "Python"},
        {"10", "12", "14"},
        {"Herbert Schildt", "James Gosling", "Dennis Ritchie"},
        {"Set", "Map", "List"}
    };

    private String[] answers = {"Islamabad", "Java", "12", "James Gosling", "List"};
    private int index = 0;
    private int score = 0;

    private JLabel questionLabel;
    private JRadioButton[] choices;
    private ButtonGroup group;
    private JButton nextButton;

    public QuizAppGUI() {
        setTitle("Quiz Application");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        questionLabel = new JLabel(questions[index]);
        add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(3, 1));
        choices = new JRadioButton[3];
        group = new ButtonGroup();
        for (int i = 0; i < 3; i++) {
            choices[i] = new JRadioButton(options[index][i]);
            group.add(choices[i]);
            optionsPanel.add(choices[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        nextButton = new JButton("Next");
        add(nextButton, BorderLayout.SOUTH);

        nextButton.addActionListener(e -> {
            String selected = null;
            for (JRadioButton rb : choices) {
                if (rb.isSelected()) {
                    selected = rb.getText();
                }
            }
            if (selected != null && selected.equals(answers[index])) {
                score++;
            }
            index++;
            if (index < questions.length) {
                updateQuestion();
            } else {
                JOptionPane.showMessageDialog(this, "Quiz Finished! Score: " + score + "/" + questions.length);
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void updateQuestion() {
        questionLabel.setText(questions[index]);
        group.clearSelection();
        for (int i = 0; i < 3; i++) {
            choices[i].setText(options[index][i]);
        }
    }

    public static void main(String[] args) {
        new QuizAppGUI();
    }
}
