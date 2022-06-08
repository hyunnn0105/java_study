package JavaStudyDate.day2;

import java.util.Scanner;

public class InputQuiz {
    public static void main(String[] args) {
        /*
            상품의 재고 총액 구하기
            가격 : 7000
            수량 : 5
            ==
            재고총액 :
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("**** 상품의 재고 총액 구하기 ****");

        System.out.print("상품의 가격 : ");
        int price = sc.nextInt();
//        System.out.println("상품의 가격 :" + won);

        System.out.print("상품의 수량 : ");
        int num = sc.nextInt();
//        System.out.println("상품의 수량 :" + num);

        System.out.println("================================");
        int total = price * num;
        System.out.printf("상품 재고 총액 : %d원\n", total);


    }
}
