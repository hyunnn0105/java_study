package JavaStudyDate.day03;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요. ]");
        System.out.printf(">> ");
        String season = sc.next();
        sc.close();


        // switch 괄호 안에는 "정수, 문자형 변수"를 씁니다.
        // 분기를 나눌 데이터가 있는 변수
        switch (season) {
            // case에는 switch 변수에 들어갈 경우의 수 값들을 배치
            // 단, 변수는 배치 불가능, 상수나 리터럴만 가능
            case "봄" : 
                // 현재 케이스에서 실행할 코드 작성
                System.out.println(" 봄에는 여의도 ");
                break; // 코드가 밑으로 흘러가는거 방지 -> 스위치 탈출
            case "여름": case "summer": case "초여름": //여러개 작성?
                System.out.println(" 여름에는 낙산 ");
                // break;
            // 영어로도 같이 하고 싶으면? -> break 지워서 코드 일부러 흘러내리게하기
//            case "summer" :
//                System.out.println(" 여름에는 낙산 ");
//                break;
            case "가을" :
            System.out.println("가을에는 춘천 ");
                break;
            case "겨울" :
            System.out.println(" 겨울에는 홍천 ");
                break;
            default: // else 기능
                System.out.println("[봄, 여름, 가을, 겨울 중 입력하세요.]");


        }
    }
}
