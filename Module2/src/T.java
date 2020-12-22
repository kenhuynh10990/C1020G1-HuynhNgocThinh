import java.io.File;
import java.io.IOException;

public class T {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Admin\\Desktop\\filename2.csv");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
