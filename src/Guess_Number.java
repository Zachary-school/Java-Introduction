import javax.swing.JOptionPane;


public class Guess_Number {
    public static void main(String[] args) throws Exception {
        int R_Number = (int) (Math.floor(Math.random() * 100)+1);
        int R_Guess = 0;

        while (R_Guess != R_Number) {
        R_Guess = Integer.parseInt(JOptionPane .showInputDialog ("Guess a number from 1 - 100"));
        if (R_Guess > R_Number) {
            JOptionPane.showMessageDialog(null, ("Lower"));
        }
        else if (R_Guess < R_Number) {
            JOptionPane.showMessageDialog(null, ("Higher"));
        }
        else {
            JOptionPane.showMessageDialog(null, ("You are correct"));
        }

        }
    }
}