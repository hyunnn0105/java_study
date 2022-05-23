package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {50, 150, 200, 250, 300}; //배열
        System.out.println("숫자를 넣을 인덱스를 입력하세요 ");
        System.out.print(">> ");
        int targetIdx = sc.nextInt(); // 삽입위치
        // int newNum = 100;

        System.out.println("insert before" + Arrays.toString(arr));
        // 1. 새 배열 만들기
            int[] temp = new int[arr.length+1];
        // 2. 배열 옮기기 - 배열복사알고리즘
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
//        System.out.println("배열옮기기 : " + Arrays.toString(temp));

        // 삽입 위치를 비워두기->
        // 3. 밀기 - (빈공간이 있는)맨끝으로 이동시키기
        for (int i = temp.length-1; i > targetIdx; i--) {
            temp[i] = temp[i-1];
        }
//        System.out.println("위치옮기기 : "  + Arrays.toString(temp));

        // 4. 빈 공간에 숫자 삽입하기
        System.out.print("숫자 넣기 : ");
        temp[targetIdx] = sc.nextInt(); //newNum
        // 5. 주소값 변경
        arr = temp; temp = null;
        System.out.println("insert after" + Arrays.toString(arr));
    }
}

/*
       배열 옮길때 사용한 식
        temp[0] = arr[0];
        System.out.println("옮기기 : " + Arrays.toString(temp));
        temp[1] = arr[1];
        System.out.println("옮기기 : " + Arrays.toString(temp));
        temp[2] = arr[2];
        System.out.println("옮기기 : " + Arrays.toString(temp));
        temp[3] = arr[3];
        System.out.println("옮기기 : " + Arrays.toString(temp));
        temp[4] = arr[4];
        System.out.println("옮기기 : " + Arrays.toString(temp));
 */

/*
        밀기 사용 식
        int targetIdx = 1;
                temp[5] = temp[4];
                temp[4] = temp[3];
                temp[3] = temp[2];
                temp[2] = temp[1];

 */