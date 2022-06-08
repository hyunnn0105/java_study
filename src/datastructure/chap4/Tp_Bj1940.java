package datastructure.chap4;

import java.util.Arrays;

// 1940
// https://www.acmicpc.net/problem/1940
// 누적X 딱 2개만 집어내기
// 1. 오름차 정렬 - Arrays.sort(배열변수)
// 2. start를 첫 위치, end를 끝위치에 둔다 X
// 3. 찾는수보다 합산 수가 작은경우 S를 오른쪽으로 한칸 이동
// 4. 찾는수보다 합산 수가 큰경우 e를 왼쪽으로 한칸 이동
// 5. 찾는 수와 합산 수가 같은경우  count를 증가시키고 s++ , e--
public class Tp_Bj1940 {
    public static void main(String[] args) {
//        int Num = 6;
        int end = 0;
        int start = 0;
        int find = 9; // 찾아야하는 부분합
//        int[] arr = new int[Num];
        int[] arr = {2, 7, 4, 1, 5, 3};
        // 오름차 정렬
        Arrays.sort(arr);
        int sum = arr[start] + arr[end];
//        System.out.println(Arrays.toString(arr));
        int count = 0; // 부분합 저장?
        while ( arr[end] < arr[arr.length]) {
            if ( sum == find) {
                count++;
                start++;
            } else if (sum > find) {

            }
        }
    }
}
