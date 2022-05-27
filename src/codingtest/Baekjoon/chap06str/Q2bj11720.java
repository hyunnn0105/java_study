package codingtest.Baekjoon.chap06str;

import java.util.Scanner;

public class Q2bj11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String n = sc.nextLine();
        String n = "5";
        int total = 0;
        // 공백없이 쓰임!!
        // 나눠서 쪼개기?
        String num = sc.nextLine();
        int sum = Integer.parseInt(num);
        for (int i = 1; i <=Integer.parseInt(n); i++) {
            total =+ sum % 10;

        }


//        for (int i = 0; i < Integer.parseInt(n); i++) {
//            String num = sc.nextLine();
//            int sum = Integer.parseInt(num);
//            total += sum;
//        }
        System.out.println(total);
    }
}
