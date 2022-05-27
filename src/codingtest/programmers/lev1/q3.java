package codingtest.programmers.lev1;

import java.util.Scanner;
// 악 이거  콜라츠 추측이다ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
public class q3 {
        public static int solution(int num) {
            boolean answer = true;
            int total = 0;
            while (true) {
                // int overflow
                long x = num;
                if (x % 2 == 0) {
                    x = x / 2;
                    total++;
                } else {
                    x = (x * 3) + 1;
                    total++;
                }


                if (x==1) {
                    answer = true;
                    break;
                } else if (total==500) {
                    num = -1;
                    break;
                }

            };
            return total;
        }

    public static void main(String[] args) {
        System.out.println(solution(10));

    }
}
