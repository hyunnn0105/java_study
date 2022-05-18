package day01;

public class Variable {
    public static void main(String[] args) {
        
        //변수의 선언 (타입지정) - int 정수
        int score;

        //변수의 초기화
        score = 78;
        // score = "hahaha" - type error
        // 선언과 초기화를 통해 변수 생성

        System.out.println(score);

        int life = 3;
        life = 5; // 변수 값 변경
        System.out.println(life);

        int triple = score*3;
        // soutv - 문자열과 숫자 얻을 수 있음
        System.out.println("triple = " + triple);

        // 정수 : int , 실수: double, 문자열: String
        String nickname = "짹짹이";
        System.out.println("nickname = " + nickname);

        // nickname = 5.5; 변수 타입과 다른값은 저장 불가
        // double score = 3.3; 같은 범위 안에서 같은 이름 사용X

        // ctrl + alt + v - 타입잡아줌
        String userName = "홍길동";
        
        //intelliJ 유용한 단축키
        
        // main은 함수
        // java - 전역변수X but 유사한건 있음

    }
}
