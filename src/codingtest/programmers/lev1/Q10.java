package codingtest.programmers.lev1;
// K보다큰수?
// https://programmers.co.kr/learn/courses/30/lessons/42748
import java.util.Arrays;

public class Q10 {
    public static int[] solution(int[] array, int[][] commands) {
        // 정답 저장할 배열
        int[] answer = new int[commands.length];

        // 2차원 배열을 반복하여 결과를 하나씩 추출
        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0] - 1; // 배열 슬라이싱 시작 인덱스
            int b = commands[i][1]; // 배열 슬라이싱 끝 인덱스
            int c = commands[i][2] - 1; // 정렬 후 결과값이 될 인덱스

            // 배열 슬라이싱
            int[] slicedArr = new int[b-a];

            for (int j = 0; j < slicedArr.length; j++) {
                // 1번쨰 ~ 7번째
                slicedArr[j] = array[j + a];
            }
//            System.out.println(Arrays.toString(slicedArr));
            Arrays.sort(slicedArr);

            // 정렬된 배열에서 결과값 확보
            int result = slicedArr[c];
            answer[i] = result;

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 2, 6, 3, 7, 4};
        int[][] B = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        // 5,2,6,3
        // 2, 3, 5, 6
        int[] solution = solution(A, B);
//        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
        System.out.println(Arrays.toString(solution));

    }
}
