package datastructure.chap4;

import java.util.Scanner;

// 백준2018
// https://www.acmicpc.net/problem/2018
public class twopointer {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

//        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

//        int N = arr.length; // 찾아야하는 부분합
        int start = 0, end = 0; // 시작포인터, 끝포인터
        int M = arr[start]; // 부분합 저장
        int count = 0; // M이 N이 되는 경우의 수
        
        // 대소비교가 관건
        while (end < N) {
            System.out.printf(" start %d, end: %d, M %d, count:%d\n",
                    start, end, M, count);
            if (M == N) {
                count++; // 원하는 합을 발견한 경우 , 경우의 수 증가
                end++;
                M += arr[end];
                if (end > arr[arr.length-1]) M += arr[end];
            } else if (M > N) { // start + end의 합이 부분합보다 커지는 경우
                M -= arr[start]; // start의 값 빼주고
                start++; // start값++
            } else {
                end++;
                M += arr[end]; // 14번까지 누적하는 장치

            };
            System.out.println(count);
        }
        */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 찾아야하는 부분합
        int[] arr = new int[N]; // 배열 생성
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int start = 0, end = 0; // 시작포인터, 끝포인터
        int M = arr[start]; // 부분합을 저장
        int count = 0;  // M이 N이 되는 경우의 수

        while (end < N) {
            System.out.printf("start: %d, end: %d, M: %d, count: %d\n"
                                , start, end, M, count);
            if (M == N) {
                count++; // 원하는 합을 발견한 경우 경우의 수 증가
                end++;
                if (end < N) M += arr[end];
            } else if (M > N) {
                M -= arr[start];
                start++;
            } else {
                end++;
                M += arr[end];
            }
        }//end while

        System.out.println(count);

    }
}
