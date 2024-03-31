import javax.swing.*;

public class testRPS {
    public static void main(String[] args) {
        boolean done=false;
        //while user wants to continue playing
        while(!done) {
            //generate random number (opponent's choice)
            int rNum = (int) ((Math.random()*2) + 1);
            RPS[] enums = RPS.getEnumConstants();
            RPS p2 = enums[rNum];

            //get user choice
            int p1 = JOptionPane.showOptionDialog(null, "What would you like to choose", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, enums, enums[0]);

            //display winner
            JOptionPane.showMessageDialog(null, "Your Choice: " + enums[p1] + "\nComputer Choice: " + p2 + "\n" + RPS.win(enums[p1], p2));

            //ask if user wants to continue playing
            int opt = JOptionPane.showConfirmDialog(null, "Play again?");
            if(opt!=0) done=true;
        }
    }//end main
}//end testRPS