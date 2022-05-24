package coding01.chap4;

import java.util.Arrays;
import java.util.Scanner;

public class Bj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        // a*b*c = num
        int num = A*B*C;

        // 0부터 9까지의 등장 횟수를 카운팅해서 저장할 배열
        int[] countArr = new int[10];

        // 자리수 별로 숫자를 쪼개서 배열에 넣기

//        while (multi > 0) {
//            // 1의 자리수를 구하기 ex) 3645853
//            int lastPosNum = multi % 10;
//            countArr[lastPosNum]++; // 1의자리 숫자에 해당하는 배열카운트 증가
//
//            // 한자리수 줄이기
//            multi /= 10;
//        }
//        System.out.println(Arrays.toString(countArr));

        for (int x : countArr) {
            System.out.println(x);
        }

        /*
        while (multi > 0 ) {

        }
        // 자연수별로 쪼개서 배열에 넣기
        // 1의 자리 수 구하기
        int lastPos = multi % 10;
        System.out.println(num);
        // num의 값 숫자 분리하기?

        for (int i = 0; i < num; i++) {
            arr[i] = num%10;
        }
        System.out.println(Arrays.toString(arr));
        // 1~9까지 몇번의 숫자가 쓰였는지 출력

         */
    }
}
