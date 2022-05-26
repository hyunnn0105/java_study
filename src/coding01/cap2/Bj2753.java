package coding01.cap2;

import java.util.Scanner;
// 윤년구하기
public class Bj2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year%4 == 0) {
            if (!((year % 100) == 0) || year%400 == 0 ) {
                System.out.println("1");
            } else {
                // else 조건 안넣어서 틀렸음
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
    /*
        package codingtest.chap02;

        import java.util.Scanner;

        public class Q4 {

            public static void day07object.PhoneFactory.main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int x = sc.nextInt(), y = sc.nextInt();
                sc.close();

                boolean xPos = x >= 0;
                boolean yPos = y >= 0;

                if (xPos && yPos) System.out.println(1);
                else if (!xPos && yPos) System.out.println(2);
                else if (!xPos && !yPos) System.out.println(3);
                else System.out.println(4);
            }
        }
     */
// 맞음