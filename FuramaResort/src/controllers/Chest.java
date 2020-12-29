package controllers;

import commons.FileCSV;
import models.Employee;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Chest {
    static Scanner scanner = new Scanner(System.in);

    public static void searchEmployee() {
        List<Employee> employeeStack = new Stack<>();
        List<String> employeeList = FileCSV.readFile("src/data/Employee.csv");

        for (int i = 0; i < employeeList.size(); i++) {
            String[] arr = employeeList.get(i).split(",");
            String id = arr[0];
            String name = arr[1];
            int age = Integer.parseInt(arr[2]);
            String address = arr[3];
            employeeStack.add(new Employee(id, name, age, address));
        }
        for(int i =0; i<employeeStack.size();i++){
            System.out.println((i+1)+"."+employeeStack.get(i).getName());
        }
        System.out.println("Enter index of Employee:");
        String index = scanner.nextLine();
        for (int i = 0; i < employeeStack.size(); i++) {
            if (index.equals(employeeStack.get(i).getId())){
                System.out.println(employeeStack.get(i).toString());
            }
        }


    }
}
