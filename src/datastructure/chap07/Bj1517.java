package datastructure.chap07;

import datastructure.chap07.merge.MergeSort;

import java.util.Arrays;

public class Bj1517 {
    private static int[] temp;
    // 한줄입력 - br.readline

        private static void mergeSort(int[] arr, int s, int e){

            // 분할한 배열의 원소가 1개 이하면 return
            if (e - s < 1) return; // 재귀함수 종료조건

            // 분할의 중앙점을 찾아야함
            int m = (s+e)/2;

            // 분할작업
            // 0,3 ...
            mergeSort(arr, s, m);
            // 4,7 ...
            mergeSort(arr,m+1, e);

            // 병합작업 - 투포인터

            // 부분배열을 임시 배열 저장
            for (int i = s; i <= e; i++) {
                temp[i] = arr[i];
            }

            // 포인터 2개 선언
            int p1 = s;
            int p2 = m+1;

            // 포인터끼리 비교한 후 원본배열에 넣어야 할 위치를 지정
            int insertSpot = s;
            int count = 0;
            // 병합 루프
            while (p1 <= m && p2 <= e) {
                if (temp[p1] < temp[p2]) {
                    arr[insertSpot++] = temp[p1++];
                } else {
                    //======================================================== 그 자리로 가는 동안
                    count += (p2-insertSpot);
                    arr[insertSpot++] = temp[p2++];
                    
                }
            }

        /*
            오른쪽 부분배열이 먼저 소모된 경우에는
            왼쪽 부분배열은 아직 데이터가 남아있기 때문에
            마저 뽑아서 원본배열에 순서대로 채워야함
         */

            // p1이 m에 도달 못함
            while(p1<=m) {
                arr[insertSpot++] = temp[p1++];

            }
            while(p2<=e) {
                arr[insertSpot++] = temp[p2++];
            }

        }

        public static void sort(int[] arr) {
            temp = new int[arr.length];
            mergeSort(arr, 0, arr.length - 1);
        }
    /*

       |                 |
       0   1   2   3     4  5   6   7
    [ 24, 32, 42, 60 ] [ 5, 15, 45, 90 ]

    [  5 ]

    - 병합 과정에서 *뒤쪽 배열의 값이 작은경우* 5의 값이 4번인덱스에서 0번으로 이동하므로
      버블정렬에서 4번 스왑이 일어났다고 볼 수 있음

                             |  |
       0   1   2   3     4   5  6   7
    [ 24, 32, 42, 60 ] [ 5, 15, 45, 90 ]
    // 병렬과정에서 인덱스 찾아서

    [  5, 15, 24, 32  , 42, 45 ]

    - 병합 과정에서 *뒤쪽 배열의 값이 작은경우* 45의 값이 6번인덱스에서 5번으로 이동하므로
      버블정렬에서 1번 스왑이 일어났다고 볼 수 있음

 */

    public static void main(String[] args) {
        // 병합과정중에 변동이 있다
        // 자신의 인덱스-옮겨간 인덱스

        int[] narr = {3,2,1};

        MergeSort.sort(narr);
        System.out.println(Arrays.toString(narr));


    }
}
