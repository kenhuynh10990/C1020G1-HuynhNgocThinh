package java_collection_framework.thuc_hanh.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student("A", 20, "QN");
        Student student_2 = new Student("B", 65, "DN");
        Student student_3 = new Student("C", 30, "HN");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student_1);
        lists.add(student_2);
        lists.add(student_3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
