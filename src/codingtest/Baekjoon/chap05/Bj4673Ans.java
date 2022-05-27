package codingtest.Baekjoon.chap05;

public class Bj4673Ans {
    // self-num
    // n = 91 return 91 + 9 + 1 = 101


    static int d(int n){
        int selfNum = n;
        while (n > 0) {
            selfNum += (n%10); // +9
            n /= 10; // n의 끝자리를 없애줌 (9->올라가서 반복)
        }
        return selfNum;



    }

    public static void main(String[] args) {

        boolean[] proofs = new boolean[10000];
        // 왜 t/f로 판별해서 받는거징
        for (int i = 1; i < 10; i++) {
            int d1 = d(i);
            if (d1 <= proofs.length){
                proofs[d1-1] = true;
            }
        }
        // selnum 출력
        for (int i = 0; i < proofs.length; i++) {
            if (!proofs[i]){
                System.out.println(i+1);
            }
        }
    }
}
