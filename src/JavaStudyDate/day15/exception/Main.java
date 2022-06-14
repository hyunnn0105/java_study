package JavaStudyDate.day15.exception;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    // throw IOException
    public static void main(String[] args) {
        try {
            int n = EasyScanner.inputInteger("정수 ");
            double v = EasyScanner.inputFloat("실수");
        } catch (Exception e) {

        }
    }

}
