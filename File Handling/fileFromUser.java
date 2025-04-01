import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

import java.util.Scanner;

public class fileFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = sc.next();

        try(FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);

        }catch(FileNotFoundException o){
            System.out.printf("File not found exception %s: ", o.getMessage());

        }catch(IOException e){
            System.out.printf("Exception occurred: %s ", e.getMessage());
        }
    }
}
