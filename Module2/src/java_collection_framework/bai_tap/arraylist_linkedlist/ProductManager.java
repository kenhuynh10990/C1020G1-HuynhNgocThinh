package java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private Product product;
    List<Product> myArray = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
    }

    public ProductManager(Product product) {
        this.product = product;
    }

    public void addProduct() {
        int id = (myArray.size() > 0) ? (myArray.size() + 1) : 1;
        scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter info");
        String productinfo = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        Product product = new Product(id, name, productinfo, price);
        myArray.add(product);
        System.out.println("Done");
    }

    public void edit() {
        System.out.println("Enter ID:");
        int id = scanner.nextInt();
        for (Product value : myArray) {
            if (value.getId() == id) {
                System.out.println("Edit product info:");
                String infoEdtit = scanner.nextLine();
                value.setProductInfo(infoEdtit);
            }else {
                System.out.println("Not available.");
                break;
            }
        }
    }

    public void delete() {
        System.out.println("Enter Id to Delete:");
        int id = scanner.nextInt();
        for (int index = 0; index < myArray.size(); index++) {
            if (myArray.get(index).getId() == id) {
                myArray.remove(index);
            } else {
                System.out.println("Not available");
                break;
            }
        }
    }

    public void display() {
        for (Product element : myArray) {
            System.out.println(element);
        }
    }

    public void searchProduct() {
        System.out.println("Enter name:");
        String searchName = scanner.nextLine();
        for (int index = 0; index < myArray.size(); index++) {
            if (myArray.get(index).getName().equals(searchName)) {
                System.out.println(myArray.get(index).toString());
            }else {
                System.out.println("Not available");
                break;
            }
        }
    }

    public void increaseSort() {
        ComparatorPrice comparatorPrice = new ComparatorPrice();
        Collections.sort(myArray, comparatorPrice);
        display();
    }
}
