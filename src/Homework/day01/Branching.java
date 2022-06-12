package Homework.day01;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        // if문 , else if문, 비교연산자, 논리연산자, swich문
        //System.in이 키보드 역할임
        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력하세요 >> ");
//        int age = sc.nextInt();
        /*
        if (age >= 20) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }
       
         */
        // 다중 if
//        if (age >= 20 && age < 40) {
//            System.out.println("청년");
//        } else if (age >= 40 && age < 60) {
//            System.out.println("중년");
//        } else {
//            System.out.println("기타");
//        }

        // 정확한 값을 가지고 분기

        System.out.println("좋아하는 색은?");
        String color = sc.nextLine();
        switch (color) {
            case "red" :
                System.out.println("레드");
                break;
            case "blue" :
                System.out.println("블루");
                break;
            case "green" : case "yellow" :
                System.out.println("그린");
                break;
            default:
                System.out.println("몰라");
                break;
        }
    }
}
