package datastructure.chap07;

import datastructure.chap07.merge.MergeSort;

import java.util.Arrays;

public class Bj2751 {
    public static void main(String[] args) {


        int num = 5;
//        int[] arr = new int[num];
        int[] arr = {5,4,3,2,1};

        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
