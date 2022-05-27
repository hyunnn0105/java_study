package codingtest.Baekjoon.chap05;

public class Bj4673 {
    // self-num
    // n = 91 return 91 + 9 + 1 = 101


    static int d(int n){
        int selfNum = n;
        while (n > 0 ) {
            selfNum += (n%10); // +9
            n /= 10; // n의 끝자리를 없애줌 (9->올라가서 반복)
        }
        return selfNum;
        
        // return이 안되는거 골라내기
        // 

                /*
            d(1) => 2
            d(2) => 4
            d(3) => 6
            ...
            d(91) => 101
            d(92) => 103
            ..
            d(10000) => 10001


         */

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int re = d(i);
            if (re<100) {
            }
            }

            for (int j = 0; j < 10000; j++) {
//                if (j!=re){
//                    System.out.println(j);
//                }
            }

    }
}
