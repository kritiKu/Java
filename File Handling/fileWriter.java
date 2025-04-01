import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args){
        String fileName = "java-course.txt";
        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello");
            writer.flush();
        }catch (IOException e){
            System.out.printf("Exception occured %s\n", e.getMessage());
        }

    }
}
