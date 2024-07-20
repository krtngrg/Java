package dupli;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KirtanGuiCalc implements ActionListener {

    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton;

    public KirtanGuiCalc() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        JLabel num1Label = new JLabel("Number 1:");
        JLabel num2Label = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Result:");

        // Create text fields
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Set result field to read-only

        // Create buttons
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");

        // Add action listeners to buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);

        // Arrange components in a grid layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(resultLabel);
        panel.add(resultField);

        // Add panel to the frame and display
        frame.setSize(1000,1000);
        frame.add(panel);
//        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2, result;

        try {
            // Parse numbers from text fields
            num1 = Double.parseDouble(num1Field.getText());
            num2 = Double.parseDouble(num2Field.getText());

            if (e.getSource() == addButton) {
                result = num1 + num2;
                resultField.setText(String.valueOf(result));
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
                resultField.setText(String.valueOf(result));
            }
        } catch (NumberFormatException ex) {
            // Handle invalid input (non-numeric characters)
            JOptionPane.showMessageDialog(null, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new KirtanGuiCalc();
    }
}
