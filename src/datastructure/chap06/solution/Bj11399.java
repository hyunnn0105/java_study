package datastructure.chap06.solution;

import java.util.Arrays;
import java.util.Scanner;

public class Bj11399 {
    // 1. 정렬 알고리즘 - 내림차순
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personNum = sc.nextInt();

        int[] arr = new int[personNum];
        for (int i = 0; i < personNum; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                    arr[j] = arr[j - 1];
                    j--;
//                    System.out.println(Arrays.toString(arr));
            }
            arr[j] = temp;
//                System.out.println(Arrays.toString(arr));
        }
//        System.out.println(Arrays.toString(arr));

        // 2. 구간합
        int[] S = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            S[i] = S[i - 1] + arr[i - 1];
        }
        // 구간합의 총합 구하기
        int sum = 0;
        for (int i = 0; i < S.length; i++) {
            sum += S[i];
        }
//        System.out.println(Arrays.toString(S));
        System.out.println(sum);


    }
}
