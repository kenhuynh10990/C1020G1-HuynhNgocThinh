package controllers;

import commons.FileCSV;
import models.Customer;
import models.Villa;

import java.util.List;
import java.util.Scanner;

import static controllers.AddServices.*;
import static controllers.CustomerMethod.CUSTOMER_PATH;
import static controllers.CustomerMethod.showInformationCustomers;
import static controllers.ShowServices.showVilla;

public class Booking {
    static Scanner scanner = new Scanner(System.in);
    static String linecustomer;
    static String lineBooking;
    static String lineAd;
    final static String BOOKING_PATH = "src/data/Booking.csv";


    public static void addNewBooking() {
        List<String> customerList = FileCSV.readFile(CUSTOMER_PATH);
        int i = 1;
        for (String s : customerList) {
            System.out.println(i + "." + s);
            i++;
        }
        System.out.println("Enter index:");
        int j = scanner.nextInt();
        linecustomer = customerList.get(j);

        int choose = -1;
        while (choose != 0) {
            System.out.println("Booking");
            System.out.println("1. Booking Villa. ");
            System.out.println("2. Booking House.");
            System.out.println("3. Booking Room.");
            System.out.println("4. Back to menu.");
            System.out.println("5. Exit.");
            System.out.println("Enter your choice: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    bookingVilla();
                    break;
                case 2:
                    bookingHouse();
                    break;
                case 3:
                    bookingRoom();
                    break;
                case 4:
                    back();
                    break;
                case 5:
                    System.exit(5);
                    break;
            }
        }
    }

    public static void bookingVilla() {
        List<String> villaList = FileCSV.readFile(PATH_VILLA);
        int i = 1;
        for (String s : villaList) {
            System.out.println(i + "." + s);
            i++;
        }

        System.out.println("Enter index:");
        int j = scanner.nextInt();
        lineBooking = villaList.get(j);
        lineAd = linecustomer + COMMA + lineBooking;
        FileCSV.writeFile(BOOKING_PATH, lineAd);


    }

    public static void bookingHouse() {
        List<String> houseList = FileCSV.readFile(PATH_HOUSE);
        int i = 1;
        for (String s : houseList) {
            System.out.println(i + "." + s);
            i++;
        }

        System.out.println("Enter index:");
        int j = scanner.nextInt();
        lineBooking = houseList.get(j);
        lineAd = linecustomer + COMMA + lineBooking;
        FileCSV.writeFile(BOOKING_PATH, lineAd);

    }

    public static void bookingRoom() {
        List<String> roomList = FileCSV.readFile(PATH_ROOM);
        int i = 1;
        for (String s : roomList) {
            System.out.println(i + "." + s);
            i++;
        }

        System.out.println("Enter index:");
        int j = scanner.nextInt();
        lineBooking = roomList.get(j);
        lineAd = linecustomer + COMMA + lineBooking;
        FileCSV.writeFile(BOOKING_PATH, lineAd);


    }
}
