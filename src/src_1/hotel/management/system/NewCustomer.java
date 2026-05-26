
package src_1.hotel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class NewCustomer extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton save;

    NewCustomer() {

        setLayout(null);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(30,30,100,30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(150,30,150,30);
        add(t1);

        JLabel l2 = new JLabel("Gender");
        l2.setBounds(30,70,100,30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(150,70,150,30);
        add(t2);

        JLabel l3 = new JLabel("Age");
        l3.setBounds(30,110,100,30);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(150,110,150,30);
        add(t3);

        JLabel l4 = new JLabel("Phone");
        l4.setBounds(30,150,100,30);
        add(l4);

        t4 = new JTextField();
        t4.setBounds(150,150,150,30);
        add(t4);

        JLabel l5 = new JLabel("Email");
        l5.setBounds(30,190,100,30);
        add(l5);

        t5 = new JTextField();
        t5.setBounds(150,190,150,30);
        add(t5);

        JLabel l6 = new JLabel("Address");
        l6.setBounds(30,230,100,30);
        add(l6);

        t6 = new JTextField();
        t6.setBounds(150,230,150,30);
        add(t6);

        JLabel l7 = new JLabel("ID Proof");
        l7.setBounds(30,270,100,30);
        add(l7);

        t7 = new JTextField();
        t7.setBounds(150,270,150,30);
        add(t7);

        JLabel l8 = new JLabel("Room No");
        l8.setBounds(30,310,100,30);
        add(l8);

        t8 = new JTextField();
        t8.setBounds(150,310,150,30);
        add(t8);

        JLabel l9 = new JLabel("Checkin Date (YYYY-MM-DD)");
        l9.setBounds(30,350,200,30);
        add(l9);

        t9 = new JTextField();
        t9.setBounds(230,350,120,30);
        add(t9);

        save = new JButton("Save");
        save.setBounds(150,400,100,40);
        save.addActionListener(this);
        add(save);

        setSize(450,500);
        setLocation(400,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        try {
            conn c = new conn();

            String query = "INSERT INTO customer(name, gender, age, phone, email, address, id_proof, room_no, checkin_date) VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = c.c.prepareStatement(query);

            ps.setString(1, t1.getText());
            ps.setString(2, t2.getText());
            ps.setInt(3, Integer.parseInt(t3.getText()));
            ps.setString(4, t4.getText());
            ps.setString(5, t5.getText());
            ps.setString(6, t6.getText());
            ps.setString(7, t7.getText());
            ps.setString(8, t8.getText());
            ps.setDate(9, Date.valueOf(t9.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Customer Saved Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}