package datastructure.chap5.queue.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2164번
// 왜 틀린거지????
public class Card2Bj2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열의 길이?
//        int[] Arr = new int[N];
//        int[] Arr = {1,2,3,4};
//
//        for (int i = 1; i <= Arr.length; i++) {
//            Arr[i-1] = i;
//            System.out.println("i = " + i);
//            System.out.println(Arrays.toString(Arr));
//        }

        // que만들기
        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
//        System.out.println(que);

        int count = 0;
        while (!que.isEmpty()){
            if (count%2==0){
                 int removed = que.poll();
//                System.out.println("removed = " + removed);
                if (que.size()==1) {
                    // 이렇게 해야 String으로 나옴
                    System.out.println(que.poll()); break;
                }
            } else {
                int n = que.poll();
                que.add(n);
//                System.out.println("n = " + n);
            }
//            System.out.println("que = " + que);
            count++;
        }

    }
}
