package io_text_file.bai_tap;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("src/io_text_file/bai_tap/a.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(
                    new File("src/io_text_file/bai_tap/b.txt"),true));


            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();



        } catch (FileNotFoundException e ){
            e.printStackTrace();
        } catch (IOException e ){
            e.printStackTrace();
        }

    }
}
