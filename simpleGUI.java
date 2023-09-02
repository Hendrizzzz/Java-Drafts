package Drafts;

import javax.swing.JOptionPane;       //importing the need for gui i guess

public class simpleGUI {
    public static void main (String[]args){

    String name = JOptionPane.showInputDialog("Are you ok?");          //to receive the user input (showInputDialog
    JOptionPane.showMessageDialog(null,"That is good to hear!?");         //to show your reply (showMessageDialog

    int number = Integer.parseInt(JOptionPane.showInputDialog("What is your favorite number?"));
    JOptionPane.showMessageDialog(null,"Your favorite number is " + number + " which is a solid choice.");

    double gwa = Double.parseDouble(JOptionPane.showInputDialog("What is GWA?"));
    JOptionPane.showMessageDialog(null, "Your GWA is " + gwa + " which is very high");
    }
}

