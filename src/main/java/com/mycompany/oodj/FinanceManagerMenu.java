/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodj;

import javax.swing.*;
import java.awt.*;

public class FinanceManagerMenu extends JPanel {
    public FinanceManagerMenu(JPanel mainPanel) {
        setLayout(new GridLayout(4, 1));

        JButton verifyPOButton = new JButton("Verify Purchase Orders");
        JButton checkStockStatusButton = new JButton("Check Stock Status");
        JButton makePaymentButton = new JButton("Make Payment");
        JButton viewPaymentStatusButton = new JButton("View Supplier Payment Status");

        add(verifyPOButton);
        add(checkStockStatusButton);
        add(makePaymentButton);
        add(viewPaymentStatusButton);

        // Implement actions to switch screens or perform functionalities
    }
}
