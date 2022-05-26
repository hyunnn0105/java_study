package coding01.cap2;

import java.util.Scanner;

public class Bj2525not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int Cooking = sc.nextInt();

        int Ch = (Cooking + M) / 60;
        int Cm = (Cooking + M) % 60;

        if ((H + Ch) < 23 && (Ch >= 1)) {
            System.out.printf("%d %d\n", (H + Ch), Cm);
            System.out.println("a");
        } else if ((H + Ch) > 23 && (M + Cooking > 60)) {
            System.out.printf("%d %d\n", (H + Ch) - 24, Cm);
            System.out.println("b");
        } else if ((H + Ch) < 23 && (Ch == 0)) {
            System.out.printf("%d %d\n", H, (Cooking + Cm));
            System.out.println("c");
        } else if ((H==23) && (M+Cooking>60) ) {
            System.out.printf("%d %d\n", (H + Ch) - 24, Cm);
            System.out.println("d");
        } else if ((H==23) && (M+Cooking<60)){
            System.out.printf("%d %d\n", 23, Cm);
            System.out.println("e");
        }
    }
}
    /*
            public static void day07object.PhoneFactory.main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int H = sc.nextInt(), M = sc.nextInt();
                int timer = sc.nextInt();
                sc.close();

                // timer를 시간과 분으로 분해하여
                // H값과 M값에 더해준다.
                H += timer / 60;
                M += timer % 60;

                // 분값 보정
                if (M >= 60) {
                    H++;
                    M -= 60;
                }

                // 시간값 보정
                if (H >= 24) {
                    H -= 24;
                }

                System.out.printf("%d %d\n", H, M);
            }
        }
     */
