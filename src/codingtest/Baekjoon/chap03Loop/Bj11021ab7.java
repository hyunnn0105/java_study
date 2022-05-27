package codingtest.Baekjoon.chap03Loop;

import java.util.Scanner;

public class Bj11021ab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // 입력을 한번에 5줄??

        for (int i = 0; i < t; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.printf("Case #"+(i+1)+": "+(A+B));

        }
        sc.close();
    }
}
/*
    import java.util.*;
    public class Main {
        public static void day07object.PhoneFactory.main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Case #" + (i + 1) + ": " + (a + b));
            } sc.close();
        }
    }
 */