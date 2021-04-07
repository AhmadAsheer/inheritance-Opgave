import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {

        //I create the file reader and i also import it. i locate the file i want java to read
        File file = new File("C:\\Users\\ahmad\\Documents\\Test\\Classified.txt");
        //I create a scanner so java can read the file
        Scanner scan = new Scanner(file);
        // i print it out
        System.out.println(scan.nextLine());

        System.out.println("");

        //Here i use fileInputStream so java can read the file while also implementing a scanner
        try (Scanner scan2 = new Scanner(new FileInputStream(file))) {
            int count = 0;
            //Here i use a while loop so i keeps counting until there isn't more words
            while (scan2.hasNext()) {
                scan2.next();
                count++;

            }
            //i print out the amount of words
            System.out.println("Number of words in the file: " + count);
        }
    }
}
