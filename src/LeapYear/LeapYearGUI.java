package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{

    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setContentPane(new LeapYearGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 480);
        frame.setVisible(true);
    }
    public void solve(){
        try {
            int year = Integer.parseInt(tfYear.getText());
            if (year % 400 == 0) {
                JOptionPane.showMessageDialog(null, "Leap year");
            } else if (year % 100 == 0) {
                JOptionPane.showMessageDialog(null, "Not a leap year");
            } else if (year % 4 == 0) {
                JOptionPane.showMessageDialog(null, "Leap year");
            } else {
                JOptionPane.showMessageDialog(null, "Not a leap year");
            }
        } catch (Exception dominic){
            JOptionPane.showMessageDialog(null,"Invalid Year Inputted!");
        }
    }
}
