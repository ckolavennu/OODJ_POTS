package com.mycompany.oodj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JPanel {
    public LoginScreen(JPanel mainPanel) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel usernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(usernameLabel, gbc);

        JTextField usernameField = new JTextField(20);
        gbc.gridx = 1;
        add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(loginButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Dummy validation
                if (username.equals("admin") && password.equals("admin")) {
                    CardLayout cl = (CardLayout) mainPanel.getLayout();
                    cl.show(mainPanel, "MainMenu");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials!");
                }
            }
        });
    }
}
