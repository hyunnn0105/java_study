package datastructure.chap08;

import java.util.Scanner;

/*
    가장 큰 동전부터 다가갈 수 있는지 생각함 50000 -> 10000 -> 5000 -> 1000 ...
    but 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
    1 5 10 50 ... 10개

    *stack 활용해도 됨

 */
public class Bj11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int i = a.length-1; i >= 0; i--) {
            if (k >= a[i]){
                count += k / a[i];
                k = k % a[i];
            }
        }
        System.out.println(count);

    }
}
