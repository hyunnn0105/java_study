package coding01.chap03Loop;

import java.util.Scanner;

public class Bj11021ab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // 입력을 한번에 5줄??

        for (int i = 0; i < t; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.printf("case #%d : %d\n", i+1, A+B);
        }

    }
}
