package coding01.chap4;

import java.util.Scanner;

public class Bj8958oxquiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 받는 숫자
        int test = sc.nextInt();

        //OX문자열을 저장할 배열
        String[] answerList = new String[test];
        for (int i = 0; i < test; i++) {
            answerList[i] = sc.next();
        }
        sc.close();

        // 하나씩 넣어서 계산해주는 함수
        for (String s : answerList) {
            // 배열
            // 문자열 특정 단일문자 취득 + 배열의 길이
            String[] oOrX = new String[s.length()];
            // System.out.println(oOrX.length);
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(2));

            //o랑 x 구분하기
            int score = 0; // 총점
            int accum = 0; // 누적점수
            // 여기 함수**
            for (int i = 0; i < oOrX.length; i++) {
                if(s.charAt(i) == 'O'){
                    if ( i == 0 || s.charAt(i-1) == 'X'){
                        // char라서(기본타입) ==에 '' 사용
                        accum = 1; // 1이 계속해서 증가
                    } else {
                        accum++;
                    }
                } else {
                    accum = 0;
                }
                score += accum;
                // o는 연속해서 맞추면 (앞의점수)+1점
    
            }
            System.out.println(score);
        }


        // x만나면 o의 값이 0으로 초기화
    }

}
