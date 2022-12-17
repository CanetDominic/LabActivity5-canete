package FoodOrdering;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;

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

    public static void main(String[] args) {
        FoodOrderGUI minic = new FoodOrderGUI();
        minic.setContentPane(minic.panel1);
        minic.setSize(600, 480);
        minic.setDefaultCloseOperation(EXIT_ON_CLOSE);
        minic.setTitle("Food Ordering System");
        minic.setVisible(true);
    }
}
