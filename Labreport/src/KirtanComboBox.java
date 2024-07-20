package dupli;
import javax.swing.*;

public class KirtanComboBox {

    public static void main(String[] args) {

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option1");
        comboBox.addItem("Option2");
        comboBox.addItem("Option3");
        comboBox.addItem("Option4");
        comboBox.addItem("Option5");

        JLabel label = new JLabel("Select an option:");
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(comboBox);


        JFrame frame = new JFrame("Combo Box Example");
        frame.add(panel);


        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

