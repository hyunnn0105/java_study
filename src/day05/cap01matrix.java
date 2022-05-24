package day05;

import java.util.Arrays;

public class cap01matrix {
    public static void main(String[] args) {
        // 2차원 배열 - 1차원 배열을 한번에 묶어서 관리
        int[] arr = {10,20,30};
        int[] arr1 = {101,201,301};
        int[] arr2 = {102,202,302};
        int[] arr3 = {103,203,303};
        
        // 2차원 배열
        int [][] score = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {33, 44, 55},
        };
        System.out.println("score.length = " + score.length);
        System.out.println("score[1].length = " + score[1].length);
        System.out.println("score[2][1] = " + score[2][1]);
        System.out.println("===============");
        // 1차원 배열의 주소들의 모음을 볼 수 있음
        System.out.println(Arrays.toString(score));
        System.out.println(score[1]);
        // 1차원 배열들의 값도 볼 수 있음
        System.out.println(Arrays.deepToString(score));
        //score[1][2]= 60, type = int, length 사용XX

        // System.out.println(Arrays.toString(score[0][1])); 배열 아니라서 안됨
        System.out.println(Arrays.toString(score[0])); // 1차원 배열

        //데이터 수정
        score[2][1] = 777;
        System.out.println(Arrays.toString(score[2]));
        score[0] = new int[] {100,200,300};
        
        //반복문 처리
        System.out.println("==============================");
        
        // int 2차원 배열 안에 1차원 배열
        // 꺼내는거 1차원 배열
        // 전체 lopp
//        for (int[] arr : score) {
//            for (int n: arr){
//                System.out.printf("%3d", n); //("%-3d", n) -무조건 3자리(000)을 정렬해라
//                //%-3는 왼쪽정렬
//            }
//            System.out.println();
//        }
        // 인덱스 정보 필요
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score.length ; j++) {
//                System.out.printf("%-4d", score[i][j]);
//            }//1차원 배열만큼 돌아감
//            System.out.println();
//        }
        // 배열생성문으로 2차원 배열 만들고 (3행 5열)
        int[][] arr2d = new int[3][5]; // 가로/세로
        arr2d[1][3] = 50;

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%-4d", anInt);
            }
            System.out.println();
        }

        /*
        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%-4d", anInt);
            }
        }*/
        // 3차원 배열
        int[][][] arr3d = {
                {
                        {1,2},
                        {3,4},
                        {5,6}
                },
                {
                        {7,8},
                        {9,10},
                        {11,12}

                },
        };
        // 4x5X6 - 3차원배열
        int [][][] arr3d_2 = new int[4][5][6];
        // 2차원 배열이 메모리에 1차원으로 저장됨
        // 2차원배열에는 1차원 배열의 주소를 저장함
    }
}
