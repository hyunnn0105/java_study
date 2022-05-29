package codingtest.Baekjoon.chap03Loop;

import java.util.Scanner;

public class Bj10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (x > a[i]) {
                System.out.print(a[i] + " ");
            }
        }

        // 출력
        // x랑 a랑 비교하기

        for (int i = 0; i < n; i++) {
            if ( x > a[i] ) {
                System.out.println("ok");
            } else {
                System.out.println("b");
            }
        }

    }
}
