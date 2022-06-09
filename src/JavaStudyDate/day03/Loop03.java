package JavaStudyDate.day03;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("음식명 : ");
            String food  = sc.nextLine();

            // 문자열 비교X - 종료하고싶으면
            if (food.equals("그만")) break;

            System.out.println("food = " + food);
        }
        System.out.println("반복문 종료");
    }
}
