package java_collection_framework.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap=new HashMap<>();
        hashMap.put("A",20);
        hashMap.put("B",46);
        hashMap.put("E",12);
        hashMap.put("D",24);
        hashMap.put("C",22);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap +"\n");

        Map<String, Integer> treeMap= new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
