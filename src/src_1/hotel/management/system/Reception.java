package src_1.hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {

    JButton addCustomer, rooms, department, employeeInfo, customerInfo, managerInfo, checkout, pickup, updateRoom, updateCheck, searchRoom;

    public Reception() {

        setTitle("Reception");
        setSize(800, 500);
        setLocation(300, 200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        addCustomer = new JButton("Add Customer");
        addCustomer.setBounds(30, 30, 200, 30);
        add(addCustomer);

        rooms = new JButton("Rooms");
        rooms.setBounds(30, 70, 200, 30);
        add(rooms);

        department = new JButton("Department");
        department.setBounds(30, 110, 200, 30);
        add(department);

        employeeInfo = new JButton("Employee Info");
        employeeInfo.setBounds(30, 150, 200, 30);
        add(employeeInfo);

        customerInfo = new JButton("Customer Info");
        customerInfo.setBounds(30, 190, 200, 30);
        add(customerInfo);

        managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(30, 230, 200, 30);
        add(managerInfo);

        checkout = new JButton("Checkout");
        checkout.setBounds(30, 270, 200, 30);
        add(checkout);

        pickup = new JButton("Pickup Service");
        pickup.setBounds(30, 310, 200, 30);
        add(pickup);

        updateRoom = new JButton("Update Room");
        updateRoom.setBounds(30, 350, 200, 30);
        add(updateRoom);

        updateCheck = new JButton("Update Check");
        updateCheck.setBounds(30, 390, 200, 30);
        add(updateCheck);

        searchRoom = new JButton("Search Room");
        searchRoom.setBounds(30, 430, 200, 30);
        add(searchRoom);

        // Action listeners
        addCustomer.addActionListener(this);
        rooms.addActionListener(this);
        department.addActionListener(this);
        employeeInfo.addActionListener(this);
        customerInfo.addActionListener(this);
        managerInfo.addActionListener(this);
        checkout.addActionListener(this);
        pickup.addActionListener(this);
        updateRoom.addActionListener(this);
        updateCheck.addActionListener(this);
        searchRoom.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == addCustomer) {
            JOptionPane.showMessageDialog(null, "Add Customer Clicked");
        } else if (ae.getSource() == rooms) {
            JOptionPane.showMessageDialog(null, "Rooms Clicked");
        } else if (ae.getSource() == department) {
            JOptionPane.showMessageDialog(null, "Department Clicked");
        } else if (ae.getSource() == employeeInfo) {
            JOptionPane.showMessageDialog(null, "Employee Info Clicked");
        } else if (ae.getSource() == customerInfo) {
            JOptionPane.showMessageDialog(null, "Customer Info Clicked");
        } else if (ae.getSource() == managerInfo) {
            JOptionPane.showMessageDialog(null, "Manager Info Clicked");
        } else if (ae.getSource() == checkout) {
            JOptionPane.showMessageDialog(null, "Checkout Clicked");
        } else if (ae.getSource() == pickup) {
            JOptionPane.showMessageDialog(null, "Pickup Clicked");
        } else if (ae.getSource() == updateRoom) {
            JOptionPane.showMessageDialog(null, "Update Room Clicked");
        } else if (ae.getSource() == updateCheck) {
            JOptionPane.showMessageDialog(null, "Update Check Clicked");
        } else if (ae.getSource() == searchRoom) {
            JOptionPane.showMessageDialog(null, "Search Room Clicked");
        }
    }
}