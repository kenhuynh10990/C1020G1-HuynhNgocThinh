package controllers;

import commons.FileCSV;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import static controllers.CustomerMethod.CUSTOMER_PATH;

public class Cinema4D {
    static Scanner scanner = new Scanner(System.in);
    static Queue<String> customerQueue = new LinkedList<>();

    public static void ticket() {
        List<String> customerList = FileCSV.readFile(CUSTOMER_PATH);

        int i = 0;
        for (String s : customerList) {
            System.out.println(i + "." + s);
            i++;
        }
        System.out.println("Enter index:");
        int j = scanner.nextInt();
        String line= customerList.get(j);
        customerQueue.add(line);

    }
    public static void showTicket(){
        while(!customerQueue.isEmpty()){
            System.out.println(customerQueue.poll());
        }



    }

}
