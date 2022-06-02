package codingtest.Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 구간합구하기
public class Bj11659 {
    // 2 4 2번쨰부터 4번째까지 더하기
    // 합배ㅁ열 만들떄 한칸+하고
    // 앞자리 0으로 만들고 한자리밀기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

//        int[] A = {5,4,3,2,1};
//        System.out.println(Arrays.toString(A));

        // 합배열 S 만들기
        // S[i] = s[i] - A[i]
        //-1에 대응하기 위해 A.length + 1
        long[] S = new long[A.length + 1];
        for (int i = 1; i <= A.length; i++) {
            S[i] = S[i - 1] + A[i - 1];
        }

        for (int i = 0; i < M; i++) {
            long x = sc.nextLong(), y = sc.nextLong();
            System.out.println(S[(int)y] - S[(int)x-1]);
        }
        sc.close();
        //System.out.println(Arrays.toString(S));

        //구간합 공식
        //(x, y) => s[y] - s[x-1]
        //(1, 3) => s[3] - s[0]

        // 1~3까지의 구간합
        //System.out.println(S[3] - S[0]);
        // 2~4까지의 구간합
        //System.out.println(S[4] - S[1]);
    }

}
