package codingtest.Baekjoon.chap4;

import java.util.Scanner;

public class Bj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자 입력받을 n
        // 정수 저장할 배열
        int[] arr = new int[9];
        // 변수 n번 입력받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        sc.close();

        // 작은 숫자 비교하기
        int max = arr[0];
        for (int x : arr) {
            max = x > max ? x : max;
        }
        System.out.println(max);
        //index 잡기
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.println(i+1);
            }
        }

    }


}