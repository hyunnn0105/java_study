package datastructure.chap02.linkedlist.Doubly;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedlist list = new DoublyLinkedlist();
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(-7);

        System.out.println(list.printList());

        list.remove(11);
        list.remove(9);

        System.out.println(list.printList());

        list.add(1);

        System.out.println(list.printList());
    }
}
