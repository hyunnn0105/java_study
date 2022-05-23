package coding01.chap03Loop;

import java.util.Scanner;

public class Bj8393hap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
