package codingtest.Baekjoon.cap2;

import java.util.Scanner;
// 알람시계
public class Bj2884not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min  = sc.nextInt();
        
        if (min>=45) {
            System.out.printf("%d %d\n", hour,min-45);
        } else if (min < 45 && hour>= 1) {
            System.out.printf("%d %d\n",hour-1 ,min+45);
        } else {
            System.out.printf("%d %d\n",23 ,min+15);
        }
        
        /*
            int hour = sc.nextInt();
            int min  = sc.nextInt();

            if (min > 45) {
                System.out.print(hour);
                System.out.print(" ");
                System.out.print(min-45);
            } else if (min < 45) {
                System.out.print(hour-1);
                System.out.print(" ");
                System.out.print(60+(min-45));
            } else if ((hour == 0) && (min<45)) {
                System.out.print(23);
                System.out.print(" ");
                System.out.println(60+(min-45));
            } else if ( min == 45) {
                System.out.print(hour);
                System.out.print(" ");
                System.out.print("00");
            } else if ((hour == 0) && (min>45)) {
                System.out.print(hour);
                System.out.print(" ");
                System.out.print(min-45);
            }
        */
    }
}

