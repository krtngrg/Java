package dupli;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class KirtanSQL {
    JFrame frame1 = new JFrame("Student panel");
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;

    JButton b1,b2,b3;

    public KirtanSQL() {

        l1 = new JLabel("id:");
        l1.setBounds(50, 50, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 100, 30);

        l2 = new JLabel("username:");
        l2.setBounds(50, 100, 100, 30);
        t2 = new JTextField();
        t2.setBounds(150, 100, 100, 30);

        l3 = new JLabel("password");
        l3.setBounds(50,150,100,30);

        t3 = new JTextField();
        t3.setBounds(150,150,100,30);

        b1 = new JButton("Insert");
        b1.setBounds(50, 250, 100, 30);

        b2 = new JButton("Delete");
        b2.setBounds(50, 300, 100, 30);

        b3 = new JButton("Display");
        b3.setBounds(50, 350, 100, 30);


        b1.addActionListener(e -> {
            int i1 = Integer.parseInt(t1.getText());
            String s2 = t2.getText();
            String s3 = t3.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("INSERT INTO `bca_detail` (`id`, `username`, `password`)"+"VALUES ('" + i1 + "','" +s2+ "','" +s3+"'");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "Insert succesful");
        });

        b2.addActionListener(e -> {
            int i1 = Integer.parseInt(t1.getText());
            String s2 = t2.getText();
            String s3 = t3.getText();
            JOptionPane.showMessageDialog(frame1,"id="+i1+" username="+s2+" password="+s3+"");
            System.out.println(+i1+s2+s3);
        });

        b3.addActionListener(e -> {
            int i1 = Integer.parseInt(t1.getText());
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("DELETE FROM bca_detail WHERE id='"+i1+"';");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "delete succesful");
        });

        frame1.add(l1);
        frame1.add(l2);
        frame1.add(l3);
        frame1.add(t1);
        frame1.add(t2);
        frame1.add(t3);
        frame1.add(b1);
        frame1.add(b2);
        frame1.add(b3);
        frame1.setSize(1000,1000);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        KirtanSQL squa1= new KirtanSQL();

    }
}
