package com.mycompany.oodj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "user_credentials.txt";

    // Method to save a new user to the file
    public static void saveUser(String name, String username, String password, String role) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + "," + username + "," + password + "," + role);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load all users from the file
    public static List<String[]> loadUsers() {
        List<String[]> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                users.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
