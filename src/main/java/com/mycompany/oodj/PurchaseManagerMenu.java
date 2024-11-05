package com.mycompany.oodj;
import javax.swing.*;
import java.awt.*;

public class PurchaseManagerMenu extends JPanel {
    public PurchaseManagerMenu(JPanel mainPanel) {
        setLayout(new GridLayout(5, 1));

        JButton viewItemsButton = new JButton("View Items");
        JButton viewSuppliersButton = new JButton("View Suppliers");
        JButton viewRequisitionsButton = new JButton("View Requisitions");
        JButton generatePOButton = new JButton("Generate Purchase Order");
        JButton viewPOButton = new JButton("View Purchase Orders");

        add(viewItemsButton);
        add(viewSuppliersButton);
        add(viewRequisitionsButton);
        add(generatePOButton);
        add(viewPOButton);

        // Implement actions to switch screens or perform functionalities
    }
}
