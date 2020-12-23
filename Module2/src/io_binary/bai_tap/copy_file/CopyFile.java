package io_binary.bai_tap.copy_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/io_binary/bai_tap/copy_file/a.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/io_binary/bai_tap/copy_file/b.txt"));
            ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("src/io_binary/bai_tap/copy_file/b.txt"));
          String line = null;
            do {
                line=(String)objectInputStream.readUTF();
                 objectOutputStream.writeUTF(line);
                objectOutputStream.close();
            } while (line!=null);
            Object line2 = null;
            do {
                try {
                    line2 = objectInputStream1.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } while (line2 != null);
        } catch (IOException e) {
            System.out.println("Done");
        }


    }
}
