package JavaStudyDate.day18.api.io.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        // buffer은 보조 스트림임으로 핵심기능을 하는 스트림에 저장 
        // -> 메인스트림과 결합해서 쓰기
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            System.out.println(s);
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
