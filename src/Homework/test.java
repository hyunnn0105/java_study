package Homework;

import java.io.*;

public class test {
    public static void main(String[] args) {
        // 1. 텍스트 파일에서 파일읽기
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("stream-data.txt"));
//        Stream<String> line = new Stream<String>();
            String line;
            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // ...
        } catch (IOException e){
            // ..
        }

        // 2. 텍스트 파일로 쓰기
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("Output.txt"));
            out.write("hello world");
        } catch (FileNotFoundException e) {
            // ...
        } catch (IOException e){

        }
    }
}
