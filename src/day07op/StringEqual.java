package day07op;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String str1 = "가나다";
        String str2 = sc.next();
        // scanner class의 객체???
        // ㅎㅎ 비슷하다

        // 객체비교시 '==' 사용하면 주소값 비교하는거라 false
        if (str1.equals(str2)) {
            System.out.println("same");
        } else {
            System.out.println("not");
        }
    }

}
