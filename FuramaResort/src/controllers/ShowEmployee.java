package controllers;

import commons.FileCSV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShowEmployee {
    public static void showEmployee(){
        Map<String, String> employeeMap= new HashMap<>();
        List<String> employeeList= FileCSV.readFile("src/data/Employee.csv");
        for (int i=0;i<employeeList.size();i++){
            String[]arr=employeeList.get(i).split(",");
            String id= arr[0];
            employeeMap.put(id,employeeList.get(i));
        }
        Set<String> keySet=employeeMap.keySet();
        for (String key: keySet){
            System.out.println(employeeMap.get(key));
        }

    }
}
