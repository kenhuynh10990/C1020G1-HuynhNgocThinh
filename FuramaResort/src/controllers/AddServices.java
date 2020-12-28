package controllers;

import commons.FileCSV;
import commons.Regex;
import javafx.concurrent.Service;
import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static controllers.MainControllers.display;

public class AddServices {
    static String id;
    static String name;
    static String area;
    static String fee;
    static String numPeople;
    static String typeRent;
    static String roomStandard;
    static String utilities;
    static String poolArea;
    static String floor;
    final static String COMMA = ",";
    static String line;
    static String freeService;
    final static String PATH_VILLA = "src/data/Villa.csv";
    final static String PATH_HOUSE = "src/data/House.csv";
    final static String PATH_ROOM = "src/data/Room.csv";

    static List<Villa> myVilla = new ArrayList<>();
    static List<House> myHouse = new ArrayList<>();
    static List<Room> myRoom = new ArrayList<>();


    static Scanner scanner = new Scanner(System.in);

    public static void addNewServices() {
        int choose1 = -1;
        while (choose1 != 0) {
            System.out.println("Menu");
            System.out.println("1. Add New Villa. ");
            System.out.println("2. Add New House.");
            System.out.println("3. Add New Room.");
            System.out.println("4. Back to Menu.");
            System.out.println("5. Exit.");
            System.out.println("Enter your choice: ");
            choose1 = scanner.nextInt();

            switch (choose1) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
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

    // addServices().
    public static void addServices(Services service) {
        scanner.nextLine();
        do {
            System.out.println("Enter Id:");
            id = scanner.nextLine();
            if (!Regex.idServiceValid(id)) {
                System.out.println("Try again!!");
            }
        } while (!Regex.idServiceValid(id));

        do {
            System.out.println("Enter Services name:");
            name = scanner.nextLine();
            if (!Regex.nameServiceValid(name)) {
                System.out.println("Try again!!!");
            }
        } while (!Regex.nameServiceValid(name));

        do {
            System.out.println("Enter area:");
            area = scanner.nextLine();
            if (!Regex.areaValid(area)) {
                System.out.println("Try again!!!");
            }

        } while (!Regex.areaValid(area));

        do {
            System.out.println("Enter fee:");
            fee = scanner.nextLine();
            if (!Regex.feeValid(fee)) {
                System.out.println("Try again!!!");
            }
        } while (!Regex.feeValid(fee));
        do {
            System.out.println("Enter number of people:");
            numPeople = scanner.nextLine();
            if (!Regex.peopleValid(numPeople)) {
                System.out.println("Try again!!");
            }
        } while (!Regex.peopleValid(numPeople));

        System.out.println("Enter type of rent:");
        typeRent = scanner.nextLine();
        service.setId(id);
        service.setNameServices(name);
        service.setAreaUsed(Double.parseDouble(area));
        service.setFee(Double.parseDouble(fee));
        service.setMaxPeople(Integer.parseInt(numPeople));
        service.setTypeRent(typeRent);


    }

    public static void addVilla() {
        Villa villa = new Villa();
//        scanner.nextLine();
        addServices(villa);
        scanner.nextLine();
        do {
            System.out.println("Room standard:");
            roomStandard = scanner.nextLine();
            if (!Regex.nameValid(roomStandard)){
                System.out.println("Try again!!!");
            }
        }while (!Regex.nameValid(roomStandard));
        System.out.println("Utilities:");
        utilities = scanner.nextLine();
        do {
            System.out.println("Pool area:");
            poolArea = scanner.nextLine();
            if (!Regex.areaValid(poolArea)) {
                System.out.println("Try again");
            }

        } while (!Regex.areaValid(poolArea));

        do {
            System.out.println("Floor:");
            floor = scanner.nextLine();
            if (!Regex.floorValid(floor)) {
                System.out.println("Try again.");
            }
        } while (!Regex.floorValid(floor));


//        Villa villa = new Villa(id, name, area, fee, numPeople, typeRent, roomStandard, utilities, poolArea, floor);
//        myVilla.add(villa);
        villa.setRoomStandard(roomStandard);
        villa.setUtilities(utilities);
        villa.setSquarePool(Double.parseDouble(poolArea));
        villa.setFloor(Integer.parseInt(floor));
        myVilla.add(villa);
        System.out.println("Done.");
        line = id + COMMA + name + COMMA + area + COMMA + fee + COMMA + numPeople + COMMA + typeRent + COMMA + roomStandard + COMMA + utilities + COMMA + poolArea + COMMA + floor;
        FileCSV.writeFile(PATH_VILLA, line);


    }

    public static void addHouse() {
        House house = new House();
        addServices(house);
        scanner.nextLine();
       do {
           System.out.println("Room standard:");
           roomStandard = scanner.nextLine();
           if (!Regex.nameValid(roomStandard)){
               System.out.println("Try again!!!");
           }
       }while (!Regex.nameValid(roomStandard));

        System.out.println("Utilities:");
        utilities = scanner.nextLine();
       do {
           System.out.println("Floor:");
           floor = scanner.nextLine();
           if (!Regex.floorValid(floor)){
               System.out.println("Try again");
           }
       }while (!Regex.floorValid(floor));


        house.setRoomStandard(roomStandard);
        house.setUtilities(utilities);
        house.setFloor(Integer.parseInt(floor));
        myHouse.add(house);
        System.out.println("Done");
        line = id + COMMA + name + COMMA + area + COMMA + fee + COMMA + numPeople + COMMA + typeRent + COMMA + roomStandard + COMMA + utilities + COMMA + floor;
        FileCSV.writeFile(PATH_HOUSE, line);
    }

    public static void addRoom() {
        Room room = new Room();

        addServices(room);
        scanner.nextLine();
        System.out.println("Free service:");
        freeService = scanner.nextLine();

        room.setFreeServies(freeService);
        myRoom.add(room);
        System.out.println("Done");
        line = id + COMMA + name + COMMA + area + COMMA + fee + COMMA + numPeople + COMMA + typeRent + COMMA + freeService;
        FileCSV.writeFile(PATH_ROOM, line);
    }

    public static void back() {
        display();
    }
}
