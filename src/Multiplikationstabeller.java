import javax.swing.*;

public class Multiplikationstabeller {
    public static void main(String[] args) {
        int Number = Integer.parseInt(JOptionPane.showInputDialog(null, "What is going to be multiplied?"));
        int i = 0;
        // While Loopen
        while (i < 10) {
            i = i + 1;
            JOptionPane.showMessageDialog(null, Number * i);
        }

        // For Loopen
        //int k;
        //for (k=0); k<10; k=k+1)
        //    JOptionPane.showInputDialog(null, Number * k);
    }
}
