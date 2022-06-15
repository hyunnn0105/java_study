package JavaStudyDate.day16.api.system;

import Utility.Util;
import datastructure.chap06.bubble.Bubble;
import datastructure.chap06.insertion.InsertionSort;
import datastructure.chap06.selection.SelectionSort;
import datastructure.chap07.radix.RedixSort;

import java.util.Arrays;
import java.util.Date;

public class SystemTime {
    public static void main(String[] args) {
        
        // 현재 시간 읽기
        // 유닉스 시간 : 1970년도 1월 1일 00시를 기준으로 현재까지의 지나온 시간을 초로 표현
        long now = System.currentTimeMillis();
        System.out.println("now = " + now);
                                    // 5일뒤 시간구하기 => 이전으로 가려면 '-' 사용
        Date date = new Date(now + (24 * 60 * 60 * 1000 * 5));
        System.out.println("date = " + date); // date = Wed Jun 15 11:54:41 KST 2022
        
        // 알고리즘 시간복잡도 계산할때도 사용가능

        Util.line();

        int[] arr = new int[100000];

        // 역순으로?
        for (int i = arr.length-1; i >= 0 ; i--) {
            arr[i] = arr.length - i;
        }

        long s = System.currentTimeMillis();

//        Bubble.sort(arr); // 버블정렬 : 8108ms
//        SelectionSort.sort(arr); // 선택정렬 : 11874ms - 원래 버블보다 조금 낮음
//        InsertionSort.sort(arr); // 삽입정렬 : 1843ms
//        RedixSort.sort(arr); // 기수정렬 : 93ms
//        Arrays.sort(arr); // 퀵정렬 : 16ms

        long e = System.currentTimeMillis();

        System.out.println((e-s) + "ms");


    }
}
