package JavaStudyDate.day18.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("C:/exercise/자바수업.txt")) {
            String str = "지금은 자바 입출력 수업중";
            fw.write(str);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
