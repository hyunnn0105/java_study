package coding01.chap4;

import java.util.Arrays;
import java.util.Scanner;

public class Bj3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] num = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt()%42;
        }
        System.out.println(Arrays.toString(arr));
        // 서로 다른 수를 구하기
        // 배열에서 서로 다른값을 가지면 카운트를 하나 늘리기
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // 저장전에 동일한 값이 있는지 체크** 중복없이
            // arr의 배열에서 찾기
            if (arr[i]==(arr[i+1])){
                count += 0;
            } else {
                num[i] = 
                count += 1;
            }
            System.out.println(count);
        }
    }
    /*
     나머지들을 저장할 배열 (10개)

  [ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 ]

  10개의 수를 반복해서 42로 나눈 나머지를 배열에 순차적으로 저장하는데
 단! 저장 전에 이미 저장되었는지 체크한 후 저장한다.
  이미 저장되었다면 해당 나머지는 배열에 넣지않는다.

 [ 10, 20, 0, 1, 5, -1, -1, -1, -1, -1 ]

  10, 20, 42, 85, 5, 84, 52


     */
}
