package day03;

import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정수 n을 입력하면 1부터 n까지 가로로 출력하는 코드

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        /*
            int i = 1;
             while (i<=n) {
            // enter 없이 띄어쓰기로 가로 출력
            System.out.printf("%d ", i);
            i++;
        }
        * */


    }
}
