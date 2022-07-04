package codingtest.Baekjoon.chap03Loop;
// https://www.acmicpc.net/problem/10952
import java.util.Scanner;

public class Bj10952 {
    public static void main(String[] args) {
        // 한줄로 입력받는건가?
        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0){
                break;
            } else {
                System.out.println(a+b);
            }
        }

    }
}

/*
덧셈		새로운수
2 + 6 = 8 	68
6 + 8 = 14	84
8 + 4 = 12	42
4 + 2 = 6	26

-- 55 ---
5 + 5 = 10	50
5 + 0 = 5	05
0 + 5 = 5	55

chapter 마지막 문제!
 */