package codingtest.Baekjoon.chap4;

import java.util.Arrays;
import java.util.Scanner;

public class bj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 시험본 과목 수
        int N = sc.nextInt();
        // 1. 조작전 성적을 배열에 저장 - 입력
        int[] scoreList = new int[N];
        for (int i = 0; i < N; i++) {
            scoreList[i] = sc.nextInt();
        }
        sc.close();
        // 2.  조작 전 성적에서 최고점 찾기
        int max = scoreList[0];
        for (int i = 0; i < scoreList.length; i++) {
            if (scoreList[i] > max) max = scoreList[i];
        }
        // 점수조작 (조작한점수/최고점 *100)
        // 조작한 점수 모을 배열 생성 - double배열
        double[] manipulatedArr = new double[scoreList.length];
        // 3.  성적 조작 수행-> 배열을 수정
        //점수조작실행
        for (int i = 0; i < scoreList.length; i++) {
            // int-> double(실수값)로 형변환
            manipulatedArr[i] = (double) scoreList[i] /max * 100;
        }
        System.out.println(Arrays.toString(manipulatedArr));
        // 4.  조작한 점수로 새로운 평균 구하기
        double total = 0.0; // 난 더블이다 보여줌
        for (double s : manipulatedArr) {
            total += s;
        }
        double avg = total / manipulatedArr.length;
        System.out.println(avg);

    }
}
