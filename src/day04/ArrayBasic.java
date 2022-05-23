package day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        // 1. 배열변수 선언
        int[] arr;

        // 2. 배열의 생성
        // 첫번째의 주소가 들어감 -> 나머지는 금방 찾아갈 수 있음
        arr = new int[5];
        System.out.println(arr);

        // 3. 배열 초기화 = 값 저장
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0] + 30;
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 55;

        // 4. 배열의 길이 - 저장 데이터 개수
        // js 배열은 리스트에 가깝다
        System.out.printf("배열의 길이 : %d\n", arr.length);
        // 값을 안넣어도 배열의 길이는 처음에 정한 값 출력

        // 배열 내부 값 확인 - 일일히 인덱스 찍어보기
        // -> alt enter/ for문으로 바꾸기 가능
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println(); // 줄바꿈
        System.out.println("=======================");

        // 배열 전용 반복문 ( 향상된 for : Enhanced for Loop )
        for ( int n : arr ) {
            System.out.printf("%d ", n);
        }
        System.out.println("\n============================");

        // 배열 내부값 출력 함수**
        System.out.println(Arrays.toString(arr)); //[30, 99, 60, 66, 100]

        // 값 목록을 나열하여 배열 생성하기 - 입력은 XX
        int[] number = new int[] {10, 20, 30, 40};
        System.out.println(Arrays.toString(number));

        // String [] foods = new String[] {"사과", "복숭아", "파인애플"};
        // new S은 배열변수 선언시에만 생략가능
        String [] foods = {"사과", "복숭아", "파인애플"};
        foods[1] = "수박";
        System.out.println(Arrays.toString(foods)); //[사과, 수박, 파인애플]

        // 두번째에는 new String[] 생략불가
        foods = new String[] {"짜장면", "탕수육", "짬뽕"};
        System.out.println(Arrays.toString(foods)); //[짜장면, 탕수육, 짬뽕]



        //**배열 생성 후 초기화하지 않는다면 - 입력받을 공간
        // 해당타입의 기본 값으로 자동 초기화 됨 (3강 4p)
        /*
        double[] dArr = new double[3];
        System.out.println("dArr.length = " + dArr.length); // 3
        System.out.println(Arrays.toString(dArr)); //[0.0, 0.0, 0.0]

         boolean [false, false, false]
         char [ ,  ,  ] - 공백
         String [null, null, null]
         Scanner [null, null, null]
         long [0, 0, 0]
        */


        double[] dArr = new double[3];
        System.out.println("dArr.length = " + dArr.length); // 3
        System.out.println(Arrays.toString(dArr)); //[0.0, 0.0, 0.0]

    }
}
