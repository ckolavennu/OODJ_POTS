package com.mycompany.oodj;
import javax.swing.*;
import java.awt.*;

public class OODJ extends JFrame {
    public OODJ() {
        setTitle("Procurement Order Tracking System (POTS)");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Main panel with CardLayout for screen navigation
        JPanel mainPanel = new JPanel(new CardLayout());
        add(mainPanel, BorderLayout.CENTER);

        // Adding screens
        mainPanel.add(new LoginScreen(mainPanel), "LoginScreen");
        mainPanel.add(new MainMenu(mainPanel), "MainMenu");
        mainPanel.add(new ItemEntryScreen(), "ItemEntryScreen");
        mainPanel.add(new SupplierEntryScreen(), "SupplierEntryScreen");
        mainPanel.add(new SalesEntryScreen(), "SalesEntryScreen");
        mainPanel.add(new RequisitionScreen(), "RequisitionScreen");
        mainPanel.add(new PurchaseOrderScreen(), "PurchaseOrderScreen");
        mainPanel.add(new UserRegistrationScreen(), "UserRegistrationScreen");

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
