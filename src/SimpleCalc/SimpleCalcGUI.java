package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JTextField tfResult;

    SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tfResult.setText(String.valueOf(solve()));
            }
        });
    }


    public static void main(String[] args) {
        SimpleCalcGUI minic = new SimpleCalcGUI();
        minic.setContentPane(minic.panel1);
        minic.setSize(600, 480);
        minic.setDefaultCloseOperation(EXIT_ON_CLOSE);
        minic.setTitle("Simple Calculator");
        minic.setVisible(true);

    }
    double solve() {
        double result = 0;
        if (cbOperations.getSelectedItem() == "+") {
            result = Double.parseDouble(tfNumber1.getText()) + Double.parseDouble(tfNumber2.getText());
        } else if (cbOperations.getSelectedItem() == "-") {
            result = Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText());
        } else if (cbOperations.getSelectedItem() == "*") {
            result = Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText());
        } else if (cbOperations.getSelectedItem() == "/") {
            result = Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText());
        }
        return result;
    }

}
