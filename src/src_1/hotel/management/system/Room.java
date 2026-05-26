package src_1.hotel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Room extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5;
    JButton save;

    Room() {

        setLayout(null);

        JLabel l1 = new JLabel("Room No");
        l1.setBounds(30,30,100,30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(150,30,150,30);
        add(t1);

        JLabel l2 = new JLabel("Room Type");
        l2.setBounds(30,70,100,30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(150,70,150,30);
        add(t2);

        JLabel l3 = new JLabel("Price");
        l3.setBounds(30,110,100,30);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(150,110,150,30);
        add(t3);

        JLabel l4 = new JLabel("Availability");
        l4.setBounds(30,150,100,30);
        add(l4);

        t4 = new JTextField();
        t4.setBounds(150,150,150,30);
        add(t4);

        JLabel l5 = new JLabel("Floor");
        l5.setBounds(30,190,100,30);
        add(l5);

        t5 = new JTextField();
        t5.setBounds(150,190,150,30);
        add(t5);

        save = new JButton("Save");
        save.setBounds(150,240,100,40);
        save.addActionListener(this);
        add(save);

        setSize(400,350);
        setLocation(400,150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        try {
            conn c = new conn();

            String query = "INSERT INTO room(room_no, room_type, price, availability, floor) VALUES(?,?,?,?,?)";

            PreparedStatement ps = c.c.prepareStatement(query);

            ps.setString(1, t1.getText());
            ps.setString(2, t2.getText());
            ps.setInt(3, Integer.parseInt(t3.getText()));
            ps.setString(4, t4.getText());
            ps.setInt(5, Integer.parseInt(t5.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Room Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Room();
    }
}