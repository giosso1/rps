import javax.swing.*;

public class testRPS {
    public static void main(String[] args) {
        boolean done=false;
        while(!done) {
            int rNum = (int) ((Math.random()*2) + 1);
            RPS[] enums = RPS.getEnumConstants();
            RPS p2 = enums[rNum];

            int p1 = JOptionPane.showOptionDialog(null, "What would you like to choose", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, enums, enums[0]);

            JOptionPane.showMessageDialog(null, "Your Choice: " + enums[p1] + "\nComputer Choice: " + p2 + "\n" + RPS.win(enums[p1], p2));
            int opt = JOptionPane.showConfirmDialog(null, "Play again?");
            if(opt!=0) done=true;
        }
    }//end main
}//end testRPS