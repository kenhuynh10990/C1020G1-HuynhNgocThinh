package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {
    public static void writeFile(String filePath,String line){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readFile(String filePath){
        List<String> list=new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
