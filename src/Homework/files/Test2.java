package Homework.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new FileReader("C:/intellij/IdeaProjects/java_study/src/Homework/files/stream-data.txt")
        );
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println(str);

        }
        reader.close();

        /*
        String file = "C:/intellij/IdeaProjects/java_study/src/Homework/files";

        try {
            FileInputStream inputStream = new FileInputStream(file);

            while (inputStream.available()>0){
                System.out.println((int) inputStream.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */

    }
}
