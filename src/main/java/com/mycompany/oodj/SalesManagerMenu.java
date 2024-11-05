/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodj;

import javax.swing.*;
import java.awt.*;

public class SalesManagerMenu extends JPanel {
    public SalesManagerMenu(JPanel mainPanel) {
        setLayout(new GridLayout(5, 1));

        JButton viewItemsButton = new JButton("View Items");
        JButton dailySalesEntryButton = new JButton("Daily Sales Entry");
        JButton salesReportButton = new JButton("Sales Report");
        JButton viewStockLevelButton = new JButton("View Stock Levels");
        JButton createRequisitionButton = new JButton("Create Requisition");

        add(viewItemsButton);
        add(dailySalesEntryButton);
        add(salesReportButton);
        add(viewStockLevelButton);
        add(createRequisitionButton);

        // Implement actions to switch screens or perform functionalities
    }
}
