import javax.swing.JOptionPane;


public class True_False {
    public void TrueFalse ()throws Exception {
        
    boolean correct = false;
        while (correct != true) {
            int result_1 = JOptionPane.showConfirmDialog(null, "A Circle is a shape, Yes or No",
            "True Or False", JOptionPane.YES_NO_OPTION);
            if (result_1 == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, ("You are correct"));
                correct = true;

                int result_2 = JOptionPane.showConfirmDialog(null, "You can eat a apple, Yes or No",
                "True Or False", JOptionPane.YES_NO_OPTION);
                if (result_2 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, ("You are correct"));
                    correct = true;

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
            else if (result_1 == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, ("You are incorrect"));
                correct = false;
            }
            else {
                correct = true;
            }
        }
    }
}

