package codingtest.Baekjoon.chap03Loop;

import java.util.Scanner;
//구구단 - 맞음
public class Bj2739Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i < 10; i++ ){
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}
