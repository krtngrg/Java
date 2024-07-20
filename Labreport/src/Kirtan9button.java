package dupli;
import java.awt.*;
import javax.swing.*;

public class Kirtan9button  {
    public Kirtan9button(){
        JFrame frame = new JFrame("9 Buttons");
        GridLayout grid = new GridLayout(3,3);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(grid);
        frame.setResizable(false);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
    }
    public static void main(String[] args) {
       new Kirtan9button();
    }
}
