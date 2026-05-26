package src_1.hotel.management.system;

import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JTextField username;
    JPasswordField password;
    JButton login;

    Login() {

        setLayout(null);

        JLabel user = new JLabel("Username:");
        user.setBounds(40, 40, 100, 30);
        add(user);

        username = new JTextField();
        username.setBounds(150, 40, 150, 30);
        add(username);

        JLabel pass = new JLabel("Password:");
        pass.setBounds(40, 90, 100, 30);
        add(pass);

        password = new JPasswordField();
        password.setBounds(150, 90, 150, 30);
        add(password);

        login = new JButton("Login");
        login.setBounds(120, 140, 100, 30);
        login.addActionListener(this);
        add(login);

        setSize(400, 250);
        setLocation(500, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String user = username.getText();
        String pass = password.getText();

        if(user.equals("admin") && pass.equals("1234")) {
            new Dashboard();
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Login");
        }
    }
}