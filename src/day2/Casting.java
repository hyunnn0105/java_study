package day2;

public class Casting {
    public static void main(String[] args) {
        byte a = 100;   //1byte 할당
        int b = a;  // a가 int로 자동 형변환

        double c = b;   //(정수)=(실수) b가 double로 자동형변환
        System.out.println("c = " + c);

        /*
            왜 자동으로 해줄까?
            -> 작은거에서 큰거로 가는거는
            (자리가 많아서)문제가 없어서
        */

    }
}
