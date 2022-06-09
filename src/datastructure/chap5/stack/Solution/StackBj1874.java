package datastructure.chap5.stack.Solution;

import java.util.Scanner;
import java.util.Stack;
// https://www.acmicpc.net/status?user_id=hyunnn0105&problem_id=1874&from_mine=1

public class StackBj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 1~N까지 자연수
//        int[] A = {1,2,5,3,4}; // 만들어야할 수열
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }


        //java api사용
        // java가 제공하는 stack 사용
        Stack<Integer> stack = new Stack<>();

        // 기호를 저장할 문자열
//        String s = "";
        // 기본값 : 빈 문자열 "";
        StringBuilder s = new StringBuilder();

        int Num = 1; // 자연수값 저장
        // 수열 배열에서 값을 하나씩 뽑아서 push, pop여부 확인
        for (int i = 0; i < A.length; i++) {
            int targetNum = A[i]; // 현재수열의 값
            if (targetNum >= Num) {
                //push인 경우
                while (targetNum >= Num) {
                    stack.push(Num++);
                    s.append("+\n"); // 문자열 결합효과
                }
                // 마지막에 들어간 수를 pop
                stack.pop();
                s.append("-\n");
            } else {
                // pop인경우
                int n = stack.pop(); // 스택에서 제거한 숫자

                // stack의 가장 위의 수가 현재 구해야하는 수열값보다 크면
                // 수열 출력이 성립X
                if (n > targetNum) {
//                    System.out.println("NO");
                    //통채로 바꾼다면 new StringBuilder("NO") 이렇게 써주기
                    s = new StringBuilder("NO");
                    break;
                }
                s.append("-\n");
            }

        }
        System.out.println(s);
    }
}
