package coding01.cap1;

import java.util.Scanner;

public class Bj2588 {
    public static void main(String[] args) {
        // 반복문 패턴화도 생각하기
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // ---- (1)
        int B = sc.nextInt(); // ---- (2)

        // 8을 구하기 위한 수
        int C = (B/10);
        int D = C - (B/100)*10;

        System.out.println( A * (B%10) ); // 5 ---- (3)
        // System.out.println( C ); // 8
        System.out.println( A * D ); // 8 ----- (4)
        System.out.println(A*(B/100)); // 3 ---- (5)
        System.out.println(A*B); // ---- (6)
        // 맞춤

        /*

            import java.util.Scanner;

            public class Question13 {

                public static void day07object.PhoneFactory.main(String[] args) {

                    Scanner sc = new Scanner(System.in);

                    int A = sc.nextInt(), B = sc.nextInt();

                    // 472 x 5 -> 5는 385를 10으로 나눈 나머지
                    int C = A * (B % 10);
                    System.out.println(C);

                    // 472 x 8 -> 8은 385를 10으로 나눈 몫인 38에서
                    //            다시 10으로 나눈 나머지다
                    int D = A * (B / 10 % 10);
                    System.out.println(D);

                    // 472 x 3 -> 3은 385를 100으로 나눈 몫인 3에서
                    //            다시 10으로 나눈 나머지
                    int E = A * (B / 100 % 10);
                    System.out.println(E);

                    int F = C + (D * 10) + (E * 100);
                    System.out.println(F);

                    sc.close();
                }
            }
         */
    }
}
