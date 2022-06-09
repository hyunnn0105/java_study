package JavaStudyDate.day04;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {

        //배열의 맨 끝 데이터 삭제
        int[] arr = {10,20,30,40};

        // 1. 기존 배열보다 크기가 1 작은 새 배열 생성(임시)
        int[] temp = new int[arr.length - 1];

        // 2. 맨 끝 데이터를 제외한 나머지 데이터를 복사 - 기존배열-1
        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i];
        }
        // 3. 주소 바꿔주기
        arr = temp;
        temp = null;
        System.out.println("삭제 후: " + Arrays.toString(temp));

        // indexof(탐색) -> 중간삭제 / 삭제/ 추가
    }
}
