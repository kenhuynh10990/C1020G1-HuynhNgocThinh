package controllers;

import commons.FileCSV;
import commons.NameException;
import commons.Regex;
import models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerMethod {
    static String name;
    static String dateOfBirth;
    static String sex;
    static String id;
    static int phone;
    static String email;
    static String typeCustomer;
    static String address;
    static String line;
    final static String CUSTOMER_PATH = "src/data/Customer.csv";
    final static String COMMA = ",";
    static List<Customer> myCustomer = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addNewCustomer() {
        Customer customer = new Customer();
        do {
            System.out.println("Enter name:");
            name = scanner.nextLine();
            if (!Regex.nameValid(name)) {
                System.out.println("Phai viet hoa chu cai dau cau. Try again!!");
            }

        } while (!Regex.nameValid(name));
        do {
            System.out.println("Enter birthday:");
            dateOfBirth = scanner.nextLine();
            if (!Regex.birthdayValid(dateOfBirth)) {
                System.out.println("Khong dung dinh dang DD//MM//YYYY.");
            }

        } while (!Regex.birthdayValid(dateOfBirth));

        do {
            System.out.println("Enter sex:");
            sex = scanner.nextLine();
            if (!Regex.genderValid(sex)) {
                System.out.println("Khong dung.");
            }
        } while (!Regex.genderValid(sex));

        do {
            System.out.println("Enter ID:");
            id = scanner.nextLine();
            if (!Regex.idCardValid(id)) {
                System.out.println("Khong dung");
            }
        } while (!Regex.idCardValid(id));

        System.out.println("Enter phone number: ");
        phone = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println("Enter email:");
            email = scanner.nextLine();
            if (!Regex.emailValid(email)) {
                System.out.println("try again!!!");
            }
        } while (!Regex.emailValid(email));

        System.out.println("Enter type customer:");
        typeCustomer = scanner.nextLine();
        System.out.println("Enter address:");
        address = scanner.nextLine();
        customer.setFullName(name);
        customer.setDateOfBirth(dateOfBirth);
        customer.setSex(sex);
        customer.setIdNumber(Integer.parseInt(id));
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setTypeCustomer(typeCustomer);
        customer.setAddress(address);
        line = name + COMMA + dateOfBirth + COMMA + sex + COMMA + id + COMMA + phone + COMMA + email + COMMA + typeCustomer + COMMA + address;
        myCustomer.add(customer);
        FileCSV.writeFile(CUSTOMER_PATH, line);
        System.out.println("Done.");


    }

    public static void showInformationCustomers() {
        List<String> customerList = FileCSV.readFile(CUSTOMER_PATH);

        for (String s : customerList) {
            String[] arr = s.split(",");
            String name = arr[0];
            String dateOfBirth = arr[1];
            String sex = arr[2];
            int id = Integer.parseInt(arr[3]);
            int phone = Integer.parseInt(arr[4]);
            String email = arr[5];
            String typeCustomer = arr[6];
            String address = arr[7];
            Customer customer = new Customer(name, dateOfBirth, sex, id, phone, email, typeCustomer, address);

            System.out.println(customer.showInfor());
        }
    }
}
