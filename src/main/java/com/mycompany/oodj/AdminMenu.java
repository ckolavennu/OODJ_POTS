package com.mycompany.oodj;
import javax.swing.*;
import java.awt.*;

public class AdminMenu extends JPanel {
    public AdminMenu(JPanel mainPanel) {
        setLayout(new GridLayout(6, 1));

        JButton userRegistrationButton = new JButton("User Registration");
        JButton itemEntryButton = new JButton("Item Entry");
        JButton supplierEntryButton = new JButton("Supplier Entry");
        JButton salesEntryButton = new JButton("Daily Sales Entry");
        JButton requisitionButton = new JButton("Create Requisition");
        JButton purchaseOrderButton = new JButton("Purchase Order Management");

        add(userRegistrationButton);
        add(itemEntryButton);
        add(supplierEntryButton);
        add(salesEntryButton);
        add(requisitionButton);
        add(purchaseOrderButton);

        // Implement actions to switch screens or perform functionalities
    }
}
