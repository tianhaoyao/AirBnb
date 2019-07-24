package database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui {
    private JButton buttonLogin;
    private JPanel panelMain;
    private JPasswordField passwordField;
    private JTextField textUsername;

    public Ui() {
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "stfu");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ui");
        frame.setContentPane(new Ui().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
