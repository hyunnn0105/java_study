package datastructure.chap08;

import java.util.Deque;
import java.util.LinkedList;
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
        Deque<Integer> cardList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
//        int num1 = cardList.poll();
//        int num2 = cardList.poll();
        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            cardList.add(num);
        }
        while (cardList.size() > 0){
            int temp = 0;
            int num1 = cardList.pollFirst();
            int num2 = cardList.pollFirst();
            temp = num1 + num2;
            if (cardList.peekFirst() >= temp){
                cardList.addFirst(temp);
            } else {
                cardList.addLast(temp);
            }
            System.out.println(cardList);
        }





    }
}
