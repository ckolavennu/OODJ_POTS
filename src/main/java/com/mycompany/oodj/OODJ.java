package com.mycompany.oodj;
import javax.swing.*;
import java.awt.*;

public class OODJ extends JFrame {
    public OODJ() {
        setTitle("Procurement Order Tracking System (POTS)");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Main panel with CardLayout for navigation
        JPanel mainPanel = new JPanel(new CardLayout());
        add(mainPanel, BorderLayout.CENTER);

        // Adding screens to the main panel
        mainPanel.add(new LoginScreen(mainPanel), "LoginScreen");
        mainPanel.add(new UserRegistrationScreen(mainPanel), "UserRegistrationScreen");

        // Show login screen initially
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "LoginScreen");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OODJ mainFrame = new OODJ();
            mainFrame.setVisible(true);
        });
    }
}
