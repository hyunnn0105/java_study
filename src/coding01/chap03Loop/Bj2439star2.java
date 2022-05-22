package coding01.chap03Loop;

import java.util.Scanner;

public class Bj2439star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; i > k; k++){
                System.out.print("");
            }

            for (int j = 0; n-i > j; j++) {
                System.out.print("*");
            }

            System.out.print(" ");
        }

    }
}
