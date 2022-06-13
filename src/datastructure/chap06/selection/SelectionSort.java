package datastructure.chap06.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        //swap 대상을 탐색하는 루프
        // 마지막 전까지 targeting 하는게 충분하다
        for (int i = 0; i < arr.length-1; i++) {
            // 최솟값 탐색 - 시작 인덱스 정하고 다른 인덱스랑 비교
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // 면접에 자주 정렬에 대해서 물어봄 -> 정렬 6개 알기?
    public static void main(String[] args) {
        int[] arr = {33,11,99,1,22,88,55,44,66,77};

        sort(arr); //  선택정렬

        System.out.println("정렬후: " + Arrays.toString(arr));
    }
}
