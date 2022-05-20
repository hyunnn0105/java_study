package coding01.cap2;

import java.util.Scanner;
// 성적구하기
public class Bj9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

// 정답

// switch
/*
    package codingtest.chap02;

    import java.util.Scanner;

    public class Q02 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int point = sc.nextInt();
            // 몫만보고 구별하기
            switch (point / 10) {
                case 10: case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
            }
            sc.close();
        }
    }
 */