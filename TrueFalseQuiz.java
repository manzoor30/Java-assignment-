package Java;

import javax.swing.JOptionPane;

public class TrueFalseQuiz {
    public static void main(String[] args) {
        // Keep looping until the user gives the correct answer
        while (true) {
            // Ask the user a question
            int response = JOptionPane.showConfirmDialog(null, "An ant can lift 1,000 times its body weight.", "True or False Quiz", JOptionPane.YES_NO_OPTION);
            // Convert the user's response to a boolean
            boolean userAnswer = (response == JOptionPane.NO_OPTION);
            // check if the user answer is correct
            if (userAnswer) {
                JOptionPane.showMessageDialog(null, "Congratulations! You answered correctly.Ants can lift 5,000 times their body weight.");
                break;
                // ask the user to try again
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect! Try again.");
            }
    
        }
        }
    }

