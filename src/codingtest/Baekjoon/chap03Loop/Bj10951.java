package codingtest.Baekjoon.chap03Loop;

import java.util.Scanner;
// BufferedReader쓰는듯
public class Bj10951 {
    public static void main(String[] args) {
        // 한줄로 입력받는건가?
        Scanner sc = new Scanner(System.in);
        
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}
