package Java;

import javax.swing.JOptionPane;

public class GuessNumber {
    public static void main(String[] args) {
        // generate a random number between 1 to 100 
        int randomNumber = (int) (Math.random() * 100) + 1;
        //Keep asking the user to guess until they get it right 
        while (true) {
            // Ask the user to guess a number
            String input = JOptionPane.showInputDialog("Guess a number between 1 and 100:");
            // Convert the user's guess to a number
            int guess = Integer.parseInt(input);
            // check if guess is number equal to the random number  
            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number.");
                break;
                // check if guess is less than the random number
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Too low! Try again.");
                // check if guess is greater than the random number
            } else {
                JOptionPane.showMessageDialog(null, "Too high! Try again.");
            }
            
        }
    }
}
