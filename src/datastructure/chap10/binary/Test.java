package datastructure.chap10.binary;

import Utility.Util;

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


    }
}
