package coding01.chap03Loop;

import java.util.Scanner;

public class Bj2439star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 별 찍는거
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            for (int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            // System.out.println("0");
        }
    }
}
