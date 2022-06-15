package datastructure.chap07.merge;

import java.util.Arrays;

public class MergeSort {
    // 병합작업에 쓰일 임시배열
    private static int[] temp;
    
    // 병합정렬 알고리즘 - 배열, 시작인덱스, 끝 인덱스

    /**
     * 
     * @param arr - 분할 할 배열
     * @param s - 분할 시작 위치
     * @param e - 분할 끝 위치
     */
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
        
        // 병합작업
        
        // s를 i에 넣어줌
        // 부분배열을 임시 배열 저장
        for (int i = s; i <= e; i++) {
            temp[i] = arr[i];
        }
        
        // 포인터 2개 선언
        int p1 = s;
        int p2 = m+1;

        // 포인터끼리 비교한 후 원본배열에 넣어야 할 위치를 지정
        int insertSpot = s;

        // 병합 루프
        while (p1 <= m && p2 <= e) {
            if (temp[p1] < temp[p2]) {
                arr[insertSpot++] = temp[p1++];
            } else {
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


    public static void main(String[] args) {
        int[] arr = {1 ,11, 22, 33,44,55,66,77,88,99};

        sort(arr);

        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
