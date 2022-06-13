package datastructure.chap5.queue.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17298
/*
    A   3 5 2 7
    S   5 7 7
      
    1:  A[0] < A[1] -  S[0] = A[1]
    2:  A[1] > A[2] -  1번인덱스 스킵
    3:  A[2] < A[3] -  S[2] = A[3]
        A[1] < A[3] -  S[1] = A[3]
    
    
    A   9 5 4 8
    S  -1 8 8 -1
    
    1: A[0] > A[1]  - 0번 스킵
    2: A[1] > A[2]  - 1번 스킵
    3: A[2] < A[3]  - S[2] = A[3]
       A[1] < A[3]  - S[1] = A[3]
       A[0] > A[3]  - 0번 스킵
       
       스킵한걸 다음회차에 꺼내보기

 */
public class Bj17298오큰수 {
    public static void main(String[] args) throws IOException {
//        int N = 4; // 수열의 크기
//        int[] Arr = {3,5,2,7};
//        Stack NGE = new Stack<>();
//
//        int count = 0;
//        for (int i = 0; i < Arr.length; i++) {
//            if (Arr[i] > Arr[count]) {
//                NGE.push(-1 );
////                System.out.println(NGE.toString());
//
//            } else if (Arr[i] < Arr[count]){
//                NGE.push(Arr[i] );
//                count++;
//
//            }
//            System.out.println(NGE.toString());
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; // 수열 배열
        int[] answer = new int[N]; // 정답 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음에는 스택이 비어있으므로 항상 최초값을 추가

        // 3 5 2 7    || 5 7 7 -1
        for (int i = 1; i < N; i++) {

            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                answer[stack.pop()] = A[i]; // 정답 배열에 오큰수를 저장
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : answer) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);

    }
}
