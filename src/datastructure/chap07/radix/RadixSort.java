package datastructure.chap07.radix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 기수정렬의 단점 : 음수처리 불가능 쓸수는 있지만 하지마라
// 양수 배열과 음수 배열을 분리해서 만든 다음에 양수배열은 그대로
// 음수배열은 역정렬 후 마이너스 넣어주기
// 플러스 배열이랑 합치기 but 이러면 속도의 이점이 사라짐

public class RadixSort {
        
    public static void sort(int[] arr){
        // 최대 자릿수 구하기 - 문자열 : loop의 횟수 결정
        int digit = 0;
        for (int n : arr) {
            int len = String.valueOf(n).length();
            if (len > digit){
                digit = len;
            }
        }

        System.out.println(digit);
        // 각 자리수 숫자에 맞는 큐 10개 생성
        // 큐 배열 생성 - queue 저장
        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>();
        }

        /*
            각 숫자에서 1회차 루프(i==0)에서는
            각 숫자의 1의 자리수를 뽑아서 위치에 맞는 큐에 삽입
         */

        for (int i = 0; i < digit; i++) {
            /*
                i == 0 / 1의 자리수
                i == 1 / 10의 자리수
                i == 2 / 100의 자리수 ...
                ex) 753 | i = 0 | 3
                ex) 753 | i = 1 | 5
                ex) 753 | i = 2 | 7

                753 / 10^0 % 10 ==> 3
                753 / 10^1 % 10 ==> 5
                753 / 10^2 % 10 ==> 7

                target / 10^i % 10
                Math.pow(10,i) 10의 i승
                i는 자릿수
             */
            for (int j = 0; j < arr.length; j++) {
                int n = arr[j] / (int) Math.pow(10,i) % 10;
                // 해당 자리수에 맞는 큐에 저장
                queues[n].add(arr[j]);
            }
            // 큐에서 순서대로 poll하여 배열에 다시 저장
            int k = 0; // 배열 저장위치 인덱스
            for (Queue<Integer> q : queues) {
                while (!q.isEmpty()) {
                    arr[k++] = q.poll();
                }
            }

        }




    }

    public static void main(String[] args) {
        int[] arr = {753, 427, 450, 220, 110, 330, 1199, 999, 684, 598};

        sort(arr);

        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
