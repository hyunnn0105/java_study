package codingtest.Baekjoon.chap4;

import java.util.Scanner;

public class Bj10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 정수의 개수

        int[] arr = new int[N]; // 입력한 정수들을 저장할 배열

        // n번 반복해서 입력받은 정수를 순차적으로 배열에 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        sc.close();

        // 순차탐색으로 대조
        int min = arr[0], max = arr[0];
        for (int x : arr ) {
            max = x > max ? x : max;
            min = x < min ? x : min;
        }
        System.out.printf("%d %d", min, max);
    }
}
