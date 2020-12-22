package io_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class ReadCSV {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader
                    ("src/io_text_file/bai_tap/doc_file_csv/country.csv"));

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println("Country code: " + country[4] + " name: " + country[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
