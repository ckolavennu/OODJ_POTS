/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodj;

import java.io.*;

public class FileHandler {
    // Implement methods for reading and writing to text files
    public static void saveData(String filename, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadData(String filename) {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }
}
