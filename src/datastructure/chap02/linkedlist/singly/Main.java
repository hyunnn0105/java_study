package datastructure.chap02.linkedlist.singly;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //연결리스트 생성
        SimpleLinkedList list = new SimpleLinkedList();
        /*
        for (int i = 0; i < 6; i++) {
            list.insert((int) (Math.random() * 45 + 1));
        }
        System.out.println(list.printList());
        */

//        System.out.println(list.header);
        /*
            빈리스트
            1. 숫자 2 추가 (6574b225)
            기존의 헤더 ) null
            기존의 첫 노드 ) null
            헤더가 감시할거 ) 숫자2(6574b225)

             2. 숫자 5 추가 (2669b199)
            기존의 헤더 ) 6574b225
            기존의 첫 노드 ) 6574b225
            헤더가 감시할거 ) 숫자5(2669b199)

             2. 숫자 7 추가 (2344fc66)
            기존의 헤더 ) 2669b199
            기존의 첫 노드 ) 2669b199
            헤더가 감시할거 ) 숫자7(2344fc66)

         */

        // 연결리스트 생성
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(27);

        System.out.println(list.printList());

//        list.remove(1);
//        System.out.println(list.printList());


        list.remove(5);
        list.remove(1);
        list.remove(27);
        System.out.println(list.printList());

        System.out.println("==================");

        // 연결리스트
        LinkedList linkedList = new LinkedList();

        // 데이터 추가
        linkedList.add(3);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(21);

        // 데이터 삭제
        linkedList.remove(3);

        System.out.println(linkedList); // [3, 10, 15]??

    }
}
