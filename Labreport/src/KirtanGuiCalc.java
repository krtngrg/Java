package dupli;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KirtanGuiCalc implements ActionListener {

    private JTextField num1Field, num2Field,addField, subtractField;
    private JButton resultButton;

    public KirtanGuiCalc() {
        JFrame frame = new JFrame("Calculator");

        JLabel num1Label = new JLabel("Num 1:");
        JLabel num2Label = new JLabel("Num 2:");
        JLabel addLabel = new JLabel("Addition:");
        JLabel subLabel = new JLabel("Subtraction:");

        num1Field = new JTextField();
        num2Field = new JTextField();
        addField = new JTextField();
        subtractField = new JTextField();
        resultButton = new JButton("Result");
        addField.setEditable(false);
        subtractField.setEditable(false);

        resultButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addLabel);
        panel.add(addField);
        panel.add(subLabel);
        panel.add(subtractField);
        panel.add(resultButton);

        frame.setSize(500,500);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2, result;

        try {
            // Parse numbers from text fields
            num1 = Double.parseDouble(num1Field.getText());
            num2 = Double.parseDouble(num2Field.getText());

                result = num1 + num2;
                addField.setText(String.valueOf(result));

                result = num1 - num2;
                subtractField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            // Handle invalid input (non-numeric characters)
            JOptionPane.showMessageDialog(null, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new KirtanGuiCalc();
    }
}
