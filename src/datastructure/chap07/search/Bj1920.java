package datastructure.chap07.search;

import java.util.Arrays;

public class Bj1920 {
    public static void main(String[] args) {
        
        /*
        첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 
        다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
        다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 
        다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
        
        A[N] 입력받기 + 정렬
        M[num] 입력받기
        A[N] == N[num] 존재하면 1 / 존재안하면 0
        1 2 3 4 5
        1 3 7 9 5
      ->1 1 0 0 1 (3개가 존재하는건 맞음)
         */

        long[] A = {4,1,5,2,3};
        long[] M = {1,3,7,9,5};

        Arrays.sort(A); // 정렬
        System.out.println(Arrays.toString(A));

        // 이진탐색하기
        int re = 0;
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            int left = 0;
            int right = A.length -1;
            int mid;

            // 못찾는 경우도 있을 수있다
            while (left <= right){
                // mid index 계산
                mid = (left + right) / 2;

                // 찾고자하는 값이 mid값과 일치할 경우 탐색종료
                if (A[mid] == M[i]) {
                    re = 1;
                    System.out.println(re);
                    return;
                } else if (M[i] < A[mid]) {
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
                re = 0;
                System.out.println(re);
            }
        }
        System.out.println(count);


    }
}
