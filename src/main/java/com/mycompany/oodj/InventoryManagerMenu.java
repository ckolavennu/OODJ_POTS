/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodj;
import javax.swing.*;
import java.awt.*;

public class InventoryManagerMenu extends JPanel {
    public InventoryManagerMenu(JPanel mainPanel) {
        setLayout(new GridLayout(4, 1));

        JButton itemEntryButton = new JButton("Item Entry");
        JButton supplierEntryButton = new JButton("Supplier Entry");
        JButton viewStockLevelsButton = new JButton("View Stock Levels");
        JButton updateStockLevelsButton = new JButton("Update Stock Levels");

        add(itemEntryButton);
        add(supplierEntryButton);
        add(viewStockLevelsButton);
        add(updateStockLevelsButton);

        // Implement actions to switch screens or perform functionalities
    }
}
