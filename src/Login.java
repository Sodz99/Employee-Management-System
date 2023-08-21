import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);

        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);

        JButton login = new JButton("Login");
        login.setBounds(150, 140, 150, 70);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);

    }

    public static void main(String[] args) {

        new Login();
    }

}
