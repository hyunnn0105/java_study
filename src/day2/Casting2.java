package day2;

public class Casting2 {
    public static void main(String[] args) {

        // downCasting : 하위타입 변환
        // 다운캐스팅 시 값(데이터)의 손실이 일어날 수 있음

        // 0011 1110 1000
        int n = 1000;
        byte m = (byte) n; //형변환에 동의표시

        System.out.println("m = " + m);

        double k = 5.556; //실수
        int j = (int) k; //실수를 정수로 강제변환시 소숫점이 사라짐 -> 일부러 그럴수 있음
        // (int) - 형변환 연산자(단항)
        System.out.println("j = " + j);


    }

}
