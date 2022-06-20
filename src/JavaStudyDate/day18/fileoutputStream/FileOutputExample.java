package JavaStudyDate.day18.fileoutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:/exercise/dog.txt*")){

        String msg = "멍멍멍머~~~~~~~~ \n 하하하하";

        fos.write(msg.getBytes());

        } catch (FileNotFoundException e) {
            System.out.println("경로X");
        } catch (IOException e) {
            System.out.println("입충력에러");
        }


    }
}
