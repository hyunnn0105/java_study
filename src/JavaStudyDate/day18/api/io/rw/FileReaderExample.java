package JavaStudyDate.day18.api.io.rw;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:/exercise/dog.txt")){
            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
