//This program runs the Guess_Number class then the True_flase command afterwards

public class App {
    public static void main(String[] args) throws Exception {
        //set Guess_Number class as gn
        Guess_Number gn = new Guess_Number();
        //run gm
        gn.GuessNumber();
        //set True_False flass as tf
        True_False tf = new True_False();
        //run tf
        tf.TrueFalse();
    }
}
