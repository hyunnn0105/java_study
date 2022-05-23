package coding01.chap03Loop;

import java.util.Scanner;

public class Bj11022ab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                for (int i = 0; i < t; i++) {
                    int A = sc.nextInt();
                    int B = sc.nextInt();

                    System.out.println("Case #" + (i + 1) + ": " + (A) + " + " + (B) + " = " + (A + B));

                } sc.close();
    }
}