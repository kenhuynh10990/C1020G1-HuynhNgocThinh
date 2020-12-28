package controllers;

import commons.FileCSV;
import models.House;
import models.Room;
import models.Villa;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import static controllers.AddServices.*;
import static controllers.MainControllers.display;

public class ShowServices {
    static Scanner scanner = new Scanner(System.in);

    public static void show() {
        int choose1 = -1;
        while (choose1 != 0) {
            System.out.println("Menu");
            System.out.println("1. Show all Villa. ");
            System.out.println("2. Show all House.");
            System.out.println("3. Show all Room.");
            System.out.println("4.Show All Name Villa Not Duplicate.");
            System.out.println("5.Show All Name House Not Duplicate.");
            System.out.println("6.Show All Name Room Not Duplicate.");
            System.out.println("7. Back to Menu.");
            System.out.println("8. Exit.");
            System.out.println("Enter your choice: ");
            choose1 = scanner.nextInt();

            switch (choose1) {
                case 1:
                    showVilla();
                    break;
                case 2:
                    showHouse();
                    break;
                case 3:
                    showRoom();
                    break;
                case 4:
                    showAllVilla();
                    break;
//                case 5:
//                    showAllHouse();
//                    break;
//                case 6:
//                    showAllRoom();
//                    break;

                case 7:
                    display();
                    break;
                case 8:
                    System.exit(8);
            }
        }
    }

    public static void showVilla() {
//        List<Villa> villaList = AddServices.myVilla;
//        for (Villa villa : villaList) {
//            System.out.println(villa.showInfor());
//        }

        List<String> villaList = FileCSV.readFile("src/data/Villa.csv");
        for (String s : villaList) {
            String[] arr = s.split(",");
            String id = arr[0];
            String name = arr[1];
            double area = Double.parseDouble(arr[2]);
            double fee = Double.parseDouble(arr[3]);
            int numPeople = Integer.parseInt(arr[4]);
            String typeRent = arr[5];
            String roomStandard = arr[6];
            String utilities = arr[7];
            double poolArea = Double.parseDouble(arr[8]);
            int floor = Integer.parseInt(arr[9]);
            Villa villa = new Villa(id, name, area, fee, numPeople, typeRent, roomStandard, utilities, poolArea, floor);
            System.out.println(villa.showInfor());
        }
    }

    public static void showHouse() {
        List<String> houseList = FileCSV.readFile("src/data/House.csv");
        for (String s : houseList) {
            String[] arr = s.split(",");
            String id = arr[0];
            String name = arr[1];
            double area = Double.parseDouble(arr[2]);
            double fee = Double.parseDouble(arr[3]);
            int numPeople = Integer.parseInt(arr[4]);
            String typeRent = arr[5];
            String roomStandard = arr[6];
            String utilities = arr[7];
            int floor = Integer.parseInt(arr[8]);
            House house = new House(id, name, area, fee, numPeople, typeRent, roomStandard, utilities, floor);
            System.out.println(house.showInfor());
        }

    }

    public static void showRoom() {
        List<String> roomList = FileCSV.readFile("src/data/Room.csv");
//        System.out.println("id |name |area |fee |numpeople |typeRent |freeService ");

        for (String s : roomList) {
            String[] arr = s.split(",");
            String id = arr[0];
            String name = arr[1];
            double area = Double.parseDouble(arr[2]);
            double fee = Double.parseDouble(arr[3]);
            int numPeople = Integer.parseInt(arr[4]);
            String typeRent = arr[5];
            String freeService = arr[6];
            Room room = new Room(id, name, area, fee, numPeople, typeRent, freeService);
            System.out.println(room.showInfor());

//            System.out.println(roomList.get(i));
        }

    }

    public static void showAllVilla() {
        List<String> villaList = FileCSV.readFile(PATH_VILLA);
        TreeSet<Villa> villaTreeSet = new TreeSet<>();
        for (String s : villaList) {
            String[] arr = s.split(",");
            String id = arr[0];
            String name = arr[1];
            double area = Double.parseDouble(arr[2]);
            double fee = Double.parseDouble(arr[3]);
            int numPeople = Integer.parseInt(arr[4]);
            String typeRent = arr[5];
            String roomStandard = arr[6];
            String utilities = arr[7];
            double poolArea = Double.parseDouble(arr[8]);
            int floor = Integer.parseInt(arr[9]);
            Villa villa = new Villa(id, name, area, fee, numPeople, typeRent, roomStandard, utilities, poolArea, floor);
            villaTreeSet.add(villa);
        }
        for(Villa v: villaTreeSet){
            System.out.println(v.showInfor());
        }

    }
    public static void showAllHouse(){
        List<String> houseList = FileCSV.readFile(PATH_HOUSE);
        TreeSet<House> houseTreeSet = new TreeSet<>();
        for (String s : houseList) {
            String[] arr = s.split(",");
            String id = arr[0];
            String name = arr[1];
            double area = Double.parseDouble(arr[2]);
            double fee = Double.parseDouble(arr[3]);
            int numPeople = Integer.parseInt(arr[4]);
            String typeRent = arr[5];
            String roomStandard = arr[6];
            String utilities = arr[7];
            int floor = Integer.parseInt(arr[8]);
            House house = new House(id, name, area, fee, numPeople, typeRent, roomStandard, utilities, floor);
            houseTreeSet.add(house);
        }
        for(House v: houseTreeSet){
            System.out.println(v.showInfor());
        }

    }
    public static void showAllRoom(){
        List<String> roomList = FileCSV.readFile(PATH_ROOM);
        TreeSet<Room> roomTreeSet = new TreeSet<>();
        for (String s : roomList) {
            String[] arr = s.split(",");
            String id = arr[0];
            String name = arr[1];
            double area = Double.parseDouble(arr[2]);
            double fee = Double.parseDouble(arr[3]);
            int numPeople = Integer.parseInt(arr[4]);
            String typeRent = arr[5];
            String freeService = arr[6];
            Room room = new Room(id, name, area, fee, numPeople, typeRent, freeService);
            roomTreeSet.add(room);
        }
        for(Room v: roomTreeSet){
            System.out.println(v.showInfor());
        }

    }
}