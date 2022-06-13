package Homework.day01;

import Utility.Util;

public class ArraysHomework {
    public static void main(String[] args) {
        int[] intarr = new int[5];
        intarr[0] = 1;
        intarr[1] = 2;
        intarr[2] = 3;
        intarr[3] = 4;
        intarr[4] = 5;



        System.out.println(intarr[3]);

        for (int i = 0; i < intarr.length; i++) {
            System.out.println(intarr[i]);
        }

        System.out.println("========================");

        // 향상된 for문 - 배열 전체 스캔
        // item 엘리먼트를 할당받은 변수
        for (int item : intarr) {
            System.out.println(item);
        }

        System.out.println("========================");

        int[] intarr2 = {1,2,3,4,5,6};
        for (int item : intarr2) {
            System.out.println(item);
        }

        // 2차원 배열
        // table 202,403 배달X
        int[][] twodimArr = {
                {101,102,103,104},
                {201,202,203,204},
                {301,302,303,304},
                {401,402,403,404}
        };

        Util.line();

        // 나머지 집에는 우유 전달
        for (int[] floor : twodimArr) {
            for (int home : floor) {
                if (home == 202 || home == 403) {
                    // 스킵해라
                    continue;
                }
                System.out.println(home);
            }
        }



    }
}
