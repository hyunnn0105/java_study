package datastructure.chap06.solution;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bj2750 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
//        int[] arr = {5,2,3,4,1};

        for (int i = num-1; i > 0; i-- ){
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag == false) { break; }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }


//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] A = new int[N];
//        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
//
//        for (int i = N - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (A[j] > A[j + 1]) {
//                    int temp = A[j];
//                    A[j] = A[j + 1];
//                    A[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            System.out.println(A[i]);
//        }

    }
}
