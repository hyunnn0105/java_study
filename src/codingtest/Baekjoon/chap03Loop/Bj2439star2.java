package codingtest.Baekjoon.chap03Loop;

import java.util.Scanner;

public class Bj2439star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // i가 k보다 커야해서 i의 값을 1로 넣고 같아고 표시
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; i > k; k++){
                System.out.print("*");
            }
             System.out.print("\n");
        }

    }
}
