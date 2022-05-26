package coding01.chap06str;

import java.util.Scanner;

public class Q1Bj11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char c = sc.next().charAt(0); // char 한글자만 뽑기
        String s = sc.next();
        char c = s.charAt(0);
        sc.close();
        System.out.println((int)c);
    }
}
