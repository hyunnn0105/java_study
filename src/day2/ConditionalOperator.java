package day2;

public class ConditionalOperator {
    public static void main(String[] args) {
        // 조건연산자
        int x = -3;

        //      조건식(1항) / 참(2항) / 거짓(3항)
        int abs = (x >= 0) ? x : x-1;
        System.out.println("절댓값 : = " + abs);

        // String food = (money >= 5000) ? "육개장" : (money = 0) ? ""

    }
}
