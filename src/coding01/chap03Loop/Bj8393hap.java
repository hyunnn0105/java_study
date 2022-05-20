package coding01.chap03Loop;

import java.util.Scanner;

public class Bj8393hap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int i = 0;
//        while (i < n) {
//            i++;
//            System.out.print((i));
//        }
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
            System.out.print(total);
        }
    }
}
