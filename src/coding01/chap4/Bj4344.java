package coding01.chap4;

import java.util.Scanner;
// 수정하기 - 입력이 안들어감??
// 해결,,, 입력을 이상하게 함
public class Bj4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for (int k = 0; k < C; k++) {
            int stuNum = sc.nextInt();
            // int stuNum = 3;
            int[] scoreList = new int[stuNum];
            // int[] scoreList = {70, 81, 90};

            for (int i = 0; i < stuNum; i++) {
                scoreList[i] = sc.nextInt();
            }
            
            // 평균계산
            int total = 0;
            for (int s : scoreList) {
                total += s;
            }
            // System.out.println(total);
            double avg = (double) total / scoreList.length;
            // System.out.println(avg);

            //평균을 못넘은 학생들의 비율 구하기 - 반ㅇ올림 소수3자리
            // 비율구하기 평균값-
            // 비교 - 통과수/통과X 인원 구하기

            int goodScore = 0;
            for (int i = 0; i < scoreList.length; i++) {
                if (scoreList[i] > avg) goodScore++;
            }
            //System.out.println(goodScore);
            // 통과자/인원
            double notAvg = ((double) goodScore / scoreList.length) * 100;
            //System.out.println(notAvg);
            //System.out.println(String.format("%,.3f", notAvg));
            System.out.printf("%.3f%%\n", notAvg);
        }
        sc.close();
    }
}
