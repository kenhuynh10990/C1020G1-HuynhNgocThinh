package java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Add product. ");
            System.out.println("2. Edit product.");
            System.out.println("3. Delete product.");
            System.out.println("4. Show product.");
            System.out.println("5. Search product.");
            System.out.println("6. Sort.");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    productManager.increaseSort();
                    break;
                default:

            }

        }
    }
}
