package day2;


public class DataType {
    public static void main(String[] args) {
         // 정수타입 - 4개의 크기가 다르다
        byte a = 127; // ~127까지 128 XXX
        short b = 32767; // ~32767까지
        int c = 2147483647; // ~2147483637까지
        // long d = 2147483648; // 왜 저장 안됨? -> 리터럴 공간이 int라서 저장XX, 접미사 L 사용
        long d = 2147483648L;

        System.out.println("d = " + d);

        int i;
        double n = 0.0;
        for (i=0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("n = " + n); //n = 9.99999999999998;

        //실수타입 - 리터럴은 double
        float f1 = 1.2345678901234F; //4byte - float 인척하려고 F로 리터럴 타입 바꿔줌
        double d1 = 1.2345678901234; //8byte

        System.out.println("f1 = " + f1); //f1 = 1.2345679 - 용량때문에 소숫점 짤림
        //그냥,,, double 쓰기

        //논리타입 - t/f only 참고)c언어 t/f 존재X
        boolean b1 = true;
        boolean b2 = false;

        // 문자 타입

        // 기본타입 : char
        // 2byte 할당, 음수개념 X, 글자 1글자만 저장가능
        // 아스키코드

        char c1 = 'A';
        char c2 = 65; //대문자 A
        char c3 = 98; // 소문자 a
        System.out.println("c2 = " + c2);

        //문자열 타입 String - 기본X
        // String은 기본타입 아님 (char배열이 들어간)객체타입
        // 할당받는 수가 가변적이다.
        String s1 = "hello java";

        // ** 문자 + 숫자 = 문자
        System.out.println(s1 + 300 + 120);





    }
}
