package io_binary.bai_tap.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int choose = -1;
        while (choose != 0) {

            System.out.println("Menu");
            System.out.println("1. Add New Product. ");
            System.out.println("2. Show Product.");
            System.out.println("3. Search.");

            System.out.println("Enter your choice: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    search();
                    break;
            }
        }
    }

    public static void addProduct() {
        Product product = new Product();
        List<Product> productList = new ArrayList<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/io_binary/bai_tap/product_manager/product.txt")
            );
            Product product1 = null;
            do {
                product1 = (Product) objectInputStream.readObject();

                productList.add(product1);
            } while (product1 != null);

        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        scanner.nextLine();
        System.out.println("Enter id: ");
        int id =Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter brand:");
        String brand = scanner.nextLine();
        System.out.println("Enter price: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter other: ");
        String other = scanner.nextLine();
        System.out.println("Done");
        product.setId(id);
        product.setNameProduct(name);
        product.setBrand(brand);
        product.setCost(cost);
        product.setOther(other);
        productList.add(product);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/io_binary/bai_tap/product_manager/product.txt")
            );
            for (int i = 0; i < productList.size(); i++) {
                objectOutputStream.writeObject(productList.get(i));
            }

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void show() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/io_binary/bai_tap/product_manager/product.txt")
            );
            Product product = null;
            do {
                product = (Product) objectInputStream.readObject();

                System.out.println(product);
            } while (product != null);

        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void search() {
        List<Product> productList = new ArrayList<>();
        scanner.nextLine();
        System.out.println("Enter product name to search :");
        String name = scanner.nextLine();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/io_binary/bai_tap/product_manager/product.txt")
            );

            Product product = null;
            do {

                product = (Product) objectInputStream.readObject();
                productList.add(product);


            } while (product != null);

        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getNameProduct())) {
                System.out.println(productList.get(i).toString());
            }
        }
    }
}
