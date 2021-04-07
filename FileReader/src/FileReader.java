import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\ahmad\\Documents\\Test\\Classified.txt");
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());

        System.out.println("");

        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;

            }
            System.out.println("Number of words in the file: " + count);
        }
    }
}
