/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    public MainMenu(JPanel mainPanel) {
        setLayout(new GridLayout(7, 1));

        JButton itemEntryButton = new JButton("Item Entry");
        JButton supplierEntryButton = new JButton("Supplier Entry");
        JButton salesEntryButton = new JButton("Daily Sales Entry");
        JButton requisitionButton = new JButton("Create Requisition");
        JButton purchaseOrderButton = new JButton("Purchase Order Management");
        JButton userRegistrationButton = new JButton("User Registration");
        JButton exitButton = new JButton("Exit");

        add(itemEntryButton);
        add(supplierEntryButton);
        add(salesEntryButton);
        add(requisitionButton);
        add(purchaseOrderButton);
        add(userRegistrationButton);
        add(exitButton);

        itemEntryButton.addActionListener(e -> showPanel(mainPanel, "ItemEntryScreen"));
        supplierEntryButton.addActionListener(e -> showPanel(mainPanel, "SupplierEntryScreen"));
        salesEntryButton.addActionListener(e -> showPanel(mainPanel, "SalesEntryScreen"));
        requisitionButton.addActionListener(e -> showPanel(mainPanel, "RequisitionScreen"));
        purchaseOrderButton.addActionListener(e -> showPanel(mainPanel, "PurchaseOrderScreen"));
        userRegistrationButton.addActionListener(e -> showPanel(mainPanel, "UserRegistrationScreen"));
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void showPanel(JPanel mainPanel, String panelName) {
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, panelName);
    }
}
