package datastructure.chap08;

import java.util.PriorityQueue;
import java.util.Scanner;

// 최소비교횟수 - 작은묶음 먼저합치는게 유리
/*
    1. 정렬하기
    2. 앞에서부터 더하기 그 과정에 순서가 바뀌면 더하기
 */
public class grid03_Bj1715 {
    public static void main(String[] args) {


        // 우선순위 Queue - 자동정렬기능
        // queue -> 정렬해서 call 한다음에 앞으로 넣기

        PriorityQueue<Integer> cardList = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            cardList.add(sc.nextInt());
        }
        int total = 0;
        while (cardList.size() != 1) {
            int data1 = cardList.poll();
            int data2 = cardList.poll();
            total += data1 + data2;
            cardList.offer(data1 + data2);
        }
        System.out.println(total);
    }
}
