package com.mycompany.oodj;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
                List<String[]> users = FileHandler.loadUsers();

                boolean authenticated = false;
                String role = "";

                // Check credentials
                for (String[] user : users) {
                    if (user[1].equals(username) && user[2].equals(password)) {
                        authenticated = true;
                        role = user[3];
                        break;
                    }
                }

                if (authenticated) {
                    CardLayout cl = (CardLayout) mainPanel.getLayout();
                    switch (role) {
                        case "admin":
                            mainPanel.add(new AdminMenu(mainPanel), "AdminMenu");
                            cl.show(mainPanel, "AdminMenu");
                            break;
                        case "sales":
                            mainPanel.add(new SalesManagerMenu(mainPanel), "SalesManagerMenu");
                            cl.show(mainPanel, "SalesManagerMenu");
                            break;
                        case "purchase":
                            mainPanel.add(new PurchaseManagerMenu(mainPanel), "PurchaseManagerMenu");
                            cl.show(mainPanel, "PurchaseManagerMenu");
                            break;
                        case "inventory":
                            mainPanel.add(new InventoryManagerMenu(mainPanel), "InventoryManagerMenu");
                            cl.show(mainPanel, "InventoryManagerMenu");
                            break;
                        case "finance":
                            mainPanel.add(new FinanceManagerMenu(mainPanel), "FinanceManagerMenu");
                            cl.show(mainPanel, "FinanceManagerMenu");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Unknown role!");
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials!");
                }
            }
        });
    }
}
