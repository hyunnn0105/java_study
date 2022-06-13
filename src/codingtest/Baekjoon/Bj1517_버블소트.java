package codingtest.Baekjoon;

import java.util.Arrays;
import java.util.Scanner;
// 이걸로 푸는게 아님,,,
public class Bj1517_버블소트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

//        int[] arr = {3,2,1};

        int count = 0;
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

    }
}
