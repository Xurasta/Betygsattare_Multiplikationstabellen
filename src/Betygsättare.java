import javax.swing.*;
import java.util.Scanner;

public class Betygsättare {
    public static void main(String[] args) {
        int Score;
        Score = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the score?"));

        if (Score <= 14) {
            JOptionPane.showMessageDialog(null, "You got an F.");
        } else if (17 >= Score && Score >= 15) {
            JOptionPane.showMessageDialog(null, "You got an E.");
        } else if (20 >= Score && Score >= 18) {
            JOptionPane.showMessageDialog(null, "You got an D.");
        } else if (23 >= Score && Score >= 21) {
            JOptionPane.showMessageDialog(null, "You got an C.");
        } else if (26 >= Score && Score >= 24) {
            JOptionPane.showMessageDialog(null, "You got an B.");
        } else if (29 >= Score && Score >= 27) {
            JOptionPane.showMessageDialog(null, "You got an A.");
        } else if (Score > 30) {
            JOptionPane.showMessageDialog(null, "Too high value.");
        }
    }
}