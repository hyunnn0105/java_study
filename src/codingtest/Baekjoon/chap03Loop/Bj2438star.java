package codingtest.Baekjoon.chap03Loop;

import java.util.Scanner;

public class Bj2438star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        for (int i = 0; i < n; i++) {
            for (int j = 0; i + 1 > j; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
        /*
            package codingtest.chap03;

            public class Star {

                public static void day07object.PhoneFactory.main(String[] args) {

                    for (int i = 0; i < 5; i++) {
                        //별을 반복해서 찍는코드
                        for (int j = 0; j < i+1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("==================");
                }

         */
