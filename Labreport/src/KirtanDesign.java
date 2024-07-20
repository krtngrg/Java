package dupli;

import javax.swing.*;

public class KirtanDesign {
    JFrame frame1 = new JFrame("Login form");
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;

    JButton b1;

    public KirtanDesign() {

        l1 = new JLabel("username:");
        l1.setBounds(50, 50, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 100, 30);

        l2 = new JLabel("password:");
        l2.setBounds(50, 100, 100, 30);
        p1 = new JPasswordField();
        p1.setBounds(150, 100, 100, 30);

        b1 = new JButton("Login");
        b1.setBounds(50, 150, 100, 30);

        b1.addActionListener(e -> {
                    String s1 = t1.getText();
                    String s2 = p1.getText();
                    System.out.println("The following info is saved");
                    System.out.println("Username: "+s1+"\n"+"Password: "+s2);
                });

        frame1.add(l1);
        frame1.add(l2);
        frame1.add(t1);
        frame1.add(p1);
        frame1.add(b1);
        frame1.setSize(1000,1000);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        KirtanDesign form= new KirtanDesign();

    }
}
