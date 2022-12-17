package FoodOrdering;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftdrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Dominic = solve();
                JOptionPane.showMessageDialog(panel1,"The total price is PHP "+ String.format("%.2f", Dominic));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI minic = new FoodOrderGUI();
        minic.setContentPane(minic.panel1);
        minic.setSize(600, 480);
        minic.setDefaultCloseOperation(EXIT_ON_CLOSE);
        minic.setTitle("Food Ordering System");
        minic.setVisible(true);
    }
    double solve(){
        double result = 0;
        if (cPizza.isSelected()){
            result += 100;
        }if(cBurger.isSelected()){
            result += 80;
        }if(cFries.isSelected()){
            result +=65;
        }if(cSoftdrinks.isSelected()){
            result += 55;
        }if(cTea.isSelected()){
            result += 50;
        }if(cSundae.isSelected()){
            result += 40;
        }
        ButtonGroup gwapo = new ButtonGroup();
        gwapo.add(rbNone);
        gwapo.add(rb5);
        gwapo.add(rb10);
        gwapo.add(rb15);
        if (rb5.isSelected()){
            result -= 0.05*result;
        }else if(rb10.isSelected()){
            result -= 0.1*result;
        } else if (rb15.isSelected()) {
            result -= 0.15*result;
        }
        return result;
    }

}
