import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        add(heading);

        setSize(1170, 650);
        setLocation(200, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Splash();
    }

}
