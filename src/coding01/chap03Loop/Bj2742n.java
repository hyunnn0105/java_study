package coding01.chap03Loop;

import java.util.Scanner;

// n찍기
public class Bj2742n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
//        int total = 1;
        while (i<n){

            int cal = n-i;
            i++;
            System.out.println(cal);
        }
    }
}
