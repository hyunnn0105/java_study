package datastructure.chap10.binary;

import Utility.Util;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        /*
                              50
                27                              68
        12              36              55              82
    7      19      **       49      **      **      76      **

         */
        tree.add(50);
        tree.add(27);
        tree.add(68);
        tree.add(12);
        tree.add(36);
        tree.add(55);
        tree.add(82);
        tree.add(7);
        tree.add(19);
        tree.add(49);
        tree.add(76);

        tree.preOrder(tree.getRoot()); // 50 27 12 7 19 36 49 68 55 82 76
        Util.line();
        tree.inOrder(tree.getRoot());
        Util.line();
        tree.postOrder(tree.getRoot());

        System.out.println("========= 탐색 =========");
        Node found = tree.find(27);
        System.out.println(found.toString());
        System.out.println("========= 최대최소 =========");
        System.out.println("최대"+tree.findMax());
        System.out.println("최소"+tree.findMin());

        System.out.println("========================= 트리 출력 ===================== ");

        tree.delete(82);
        tree.delete(19);
        tree.display();

        // 이진트리의 문제점
        // 1. 선형구조가 생성될수도 있다
        // 2. 자식을 2명 이상 가질 수 없다
        BinaryTree tree2 = new BinaryTree();
        tree2.add(50);
        tree2.add(40);
        tree2.add(30);
        tree2.add(20);

        System.out.println("========== problem ==============");
        tree2.display();

        // AVL 트리??

        // api tree
        System.out.println("===================== api tree ==========================");
        // treeset : set 형태로 tree를 구현
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(77);
        treeSet.add(27);
        treeSet.add(7);
        treeSet.add(67);

        // 자동으로 정렬됨
        System.out.println(treeSet.toString());


        // tree Map : map 형태로 트리를 구현
        TreeMap<String, Integer> TreeMap = new TreeMap<>();
        TreeMap.put("멍멍", 30);
        TreeMap.put("야옹", 55);
        TreeMap.put("쩩", 44);
        TreeMap.put("꺼억", 24);

        // key를 정렬함
        System.out.println(TreeMap);
    }

}
