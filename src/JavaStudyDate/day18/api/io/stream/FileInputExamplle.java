package JavaStudyDate.day18.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExamplle {
    public static void main(String[] args) {
        
        // 파일을 읽어들이려면
        /*
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\sl_test\\java_study\\java_study\\src\\" +
                    "JavaStudyDate\\day17\\collection\\List\\ArrayDeleteQuiz.java");
            int data = 0;
            // 데이터를 1바이트씩 읽음
            while (data != -1) {
                data = fis.read();
                System.out.write(data); // 아스키를 문자로 출력
            }

            System.out.println("data = " + (char) data); // data = p - package
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다");
        } catch (IOException e) {
            System.out.println("출력에러");
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         */
//        FileInputStream fis = null;
        // close가 필요한 객체를 안
        /*
        String Path = "C:\\sl_test\\java_study\\java_study\\src\\JavaStudyDate\\day17\\collection\\List\\ArrayDeleteQuiz.java";
        try (fis = new FileInputStream(Path)){

            int data = 0;
            // 데이터를 1바이트씩 읽음
            while (data != -1) {
                data = fis.read();
                System.out.write(data); // 아스키를 문자로 출력
            }

            System.out.println("data = " + (char) data); // data = p - package
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다");
        } catch (IOException e) {
            System.out.println("출력에러");
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         */
    }
}
