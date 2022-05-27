package codingtest.Baekjoon.chap03Loop;

import java.util.Scanner;

public class Bj10950ab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        // 입력도 test번
        for (int n = 1; n <= test; n++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int cal = A + B;
            // 다음줄로 안넘어가서 오류...
            System.out.printf("%d\n", cal);
        }


    }
}
