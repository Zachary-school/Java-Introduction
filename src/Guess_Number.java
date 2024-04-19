//This program makes you guess a number till you get it correct with higher and lower clues

// Imports
import javax.swing.JOptionPane;

//This is the entire program
public class Guess_Number {
    public void GuessNumber () throws Exception {
        //Set an random number for the person to guess
        int R_Number = (int) (Math.floor(Math.random() * 100)+1);
        //initialize int to hold guess value
        int R_Guess = 0;

        //loop untill person gets it correct
        while (R_Guess != R_Number) {
        //get guess number from user
        R_Guess = Integer.parseInt(JOptionPane .showInputDialog ("Guess a number from 1 - 100"));
        
        //if correct tell user correct and end if incorrect tell user higher or lower
        //if user is lower than number
        if (R_Guess > R_Number) {
            JOptionPane.showMessageDialog(null, ("Lower"));
        }
        //if user is higher than number
        else if (R_Guess < R_Number) {
            JOptionPane.showMessageDialog(null, ("Higher"));
        }
        //if user is correct
        else {
            JOptionPane.showMessageDialog(null, ("You are correct"));
        }

        }//end of program
    }
}