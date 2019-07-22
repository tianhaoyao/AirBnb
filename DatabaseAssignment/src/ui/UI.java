package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    private JButton buttonLogin;
    private JPanel panelMain;
    private JTextField textUsername;
    private JPasswordField passwordField;

    public UI() {
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, textUsername.getUIClassID());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UI");
        frame.setContentPane(new UI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
