package SimpleCalc;

import javax.swing.*;
import java.awt.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox comboBox1;
    private JButton computeResultButton;
    private JTextField tfNumber2;

    public static void main(String[] args) {
        SimpleCalcGUI minic = new SimpleCalcGUI();
        minic.setContentPane(minic.panel1);
        minic.setSize(480, 480);
        minic.setDefaultCloseOperation(EXIT_ON_CLOSE);
        minic.setTitle("Simple Calculator");
        minic.setVisible(true);
    }
}
