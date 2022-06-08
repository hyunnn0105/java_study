package JavaStudyDate.day04;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열 특정 인덱스 데이터 삭제 알고리즘
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("delete before : " + Arrays.toString(arr));
        /*
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];
        */
        int delIndex = 2; // 삭제할 대상의 인덱스
        for (int i = delIndex; i < arr.length-1; i++) { //뒤에사람이 앞으로 땡김
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));


        // pop - 삭제
        int[] temp = new int[arr.length -1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i+1];
        }
        arr = temp; temp = null;
        System.out.println("delete after : " + Arrays.toString(arr));
    }
}
