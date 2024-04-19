//This program asks you 3 true and false questions and repeats untill you get it correct

//imports
import javax.swing.JOptionPane;

//This is the entire program
public class True_False {
    public void TrueFalse ()throws Exception {
        
        //set varible correct to flase to start
    boolean correct = false;
    //while statement until user gets all 3 true and false questions correct
    //and if user gets an question incorrect go back to start
        while (correct != true) {
            //get user input if statement is true or false
            int result_1 = JOptionPane.showConfirmDialog(null, "A Circle is a shape, Yes or No",
            "True Or False", JOptionPane.YES_NO_OPTION);
            //if user is correct go to next question and repeat untill all 3 is correct
            if (result_1 == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, ("You are correct"));
                correct = true;
                //question 2
                int result_2 = JOptionPane.showConfirmDialog(null, "You can eat a apple, Yes or No",
                "True Or False", JOptionPane.YES_NO_OPTION);
                if (result_2 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, ("You are correct"));
                    correct = true;
                    //question 3
                    int result_3 = JOptionPane.showConfirmDialog(null, "Coal and diamond are made of diffrent elements, Yes or No",
                    "True Or False", JOptionPane.YES_NO_OPTION);
                    if (result_3 == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, ("You are incorrect"));
                        correct = false;
                    }
                    else if (result_3 == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, ("You are correct"));
                        correct = true;
                    }
                    else{
                        correct = true;
                    }
                }
                else if (result_2 == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, ("You are incorrect"));
                    correct = false;
                }
                else {
                    correct = true;
                }
            }
            //if user is incorrect repeat question
            else if (result_1 == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, ("You are incorrect"));
                correct = false;
            }
            //allows user to press x to exit
            else {
                correct = true;
            }
        }
    }
}

