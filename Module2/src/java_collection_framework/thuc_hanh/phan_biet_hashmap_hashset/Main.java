package java_collection_framework.thuc_hanh.phan_biet_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student_1= new Student("A",20,"QN");
        Student student_2= new Student("B",65,"DN");
        Student student_3= new Student("C",30,"HN");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student_1);
        studentMap.put(2, student_2);
        studentMap.put(3, student_3);
        studentMap.put(4, student_1);

        for (Map.Entry<Integer, Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("..................Set ");
        Set<Student> students = new HashSet<Student>();
        students.add(student_1);
        students.add(student_2);
        students.add(student_3);
        students.add(student_1);

        for (Student student: students){
            System.out.println(student.toString());
        }

    }
}
