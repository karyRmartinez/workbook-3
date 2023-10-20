package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class SearchInventory {
    public static void main(String[] args) {


        System.out.printf("Hello and welcome!");

        ArrayList<Product> inventory;
        inventory = readInventory();
        System.out.println(inventory);

        inventory.sort((o1, o2) -> o1.getId() - o2.getId());

        for (Product p : inventory) {
            System.out.println(p.getId() + " " + p.getName());
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(3, "cable", 3.00));
        products.add(new Product(4, "monitor", 100.00));
        products.add(new Product(5, "lamp", 45.00));
        products.add(new Product(6, "chair", 150.00));
        return products;
    }

    public static ArrayList<Product> readInventory() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("Product.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input = null;
            while ((input = bufferedReader.readLine()) != null) {
                String[] fields = input.split(",");
                var i = Integer.parseInt(fields[0]);
                var name = fields[1].trim();
                var price = Double.parseDouble(fields[2]);

                Product p = new Product(i, name, price);
                products.add(p);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return products;

    }
}