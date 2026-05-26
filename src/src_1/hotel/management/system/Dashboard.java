package src_1.hotel.management.system;

import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JButton emp, driver, room, customer;

    Dashboard(){

        setLayout(null);

        emp = new JButton("Add Employee");
        emp.setBounds(100,50,200,40);
        emp.addActionListener(this);
        add(emp);

        driver = new JButton("Add Drivers");
        driver.setBounds(100,110,200,40);
        driver.addActionListener(this);
        add(driver);

        room = new JButton(" Room");
        room.setBounds(100,170,200,40);
        room.addActionListener(this);
        add(room);

        customer = new JButton("Add Customer");
        customer.setBounds(100,230,200,40);
        customer.addActionListener(this);
        add(customer);

        setSize(400,350);
        setLocation(500,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == emp){
            new AddEmployee();
        }else if(ae.getSource() == driver){
            new AddDrivers();
        }else if(ae.getSource() == room){
            new Room();
        }else{
            new NewCustomer();
        }
    }

    public static void main(String[] args){
        new Dashboard();
    }
}