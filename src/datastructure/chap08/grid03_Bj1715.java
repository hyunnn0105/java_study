package datastructure.chap08;

import java.util.PriorityQueue;

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
        int num1 = cardList.poll();
        int num2 = cardList.poll();



    }
}
