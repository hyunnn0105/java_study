package day04;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        // 역정렬 : 끝에 두개씩 자리 바꾸기 - 과정은 아래에
        int [] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 21};
        System.out.println("reverse before : " + Arrays.toString(arr));


        for (int i = 0; i < arr.length /2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println("reverse after : " + Arrays.toString(arr));
    }
}

        /*
        reverse 찾는 과정
            int temp = arr[0];
            arr[0] = arr[6];
            arr[6] = temp;

            temp = arr[1];
            arr[1] = arr[5];
            arr[5] = temp;

            temp = arr[2];
            arr[2] = arr[4];
            arr[4] = temp;
         */