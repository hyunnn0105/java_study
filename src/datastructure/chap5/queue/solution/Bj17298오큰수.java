package datastructure.chap5.queue.solution;

import java.util.Stack;

// https://www.acmicpc.net/problem/17298
public class Bj17298오큰수 {
    public static void main(String[] args) {
        int N = 4; // 수열의 크기
        int[] Arr = {3,5,2,7};
        Stack NGE = new Stack<>();

        int count = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > Arr[count]) {
                NGE.push(-1 );
//                System.out.println(NGE.toString());

            } else if (Arr[i] < Arr[count]){
                NGE.push(Arr[i] );
                count++;

            }
            System.out.println(NGE.toString());
        }
    }
}
