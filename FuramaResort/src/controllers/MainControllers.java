package controllers;

import java.util.Scanner;

import static controllers.AddServices.addNewServices;
import static controllers.Booking.addNewBooking;
import static controllers.Booking.bookingHouse;
import static controllers.Chest.searchEmployee;
import static controllers.Cinema4D.showTicket;
import static controllers.Cinema4D.ticket;
import static controllers.CustomerMethod.addNewCustomer;
import static controllers.CustomerMethod.showInformationCustomers;
import static controllers.ShowEmployee.showEmployee;
import static controllers.ShowServices.show;

public class MainControllers {
    static Scanner scanner = new Scanner(System.in);

    public static void display() {
        int choose = -1;
        while (choose != 0) {
            System.out.println("Menu");
            System.out.println("1. Add New Services. ");
            System.out.println("2. Show Services.");
            System.out.println("3. Add New Customer.");
            System.out.println("4. Show Information of Customer.");
            System.out.println("5. Add New Booking.");
            System.out.println("6. Show Information of Employee.");
            System.out.println("7. Buy ticket.");
            System.out.println("8. Show ticket.");
            System.out.println("9. Search Employee.");
            System.out.println("10. Exit.");
            System.out.println("Enter your choice: ");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                   addNewServices();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomers();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showEmployee();
                    break;
                case 7:
                    ticket();
                    break;
                case 8:
                    showTicket();
                    break;
                case 9:
                    searchEmployee();
                    break;
                case 10:
                    System.exit(10);
            }
        }
    }

    public static void main(String[] args) {
        display();
    }


}
