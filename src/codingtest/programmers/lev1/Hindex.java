package codingtest.programmers.lev1;
// https://programmers.co.kr/learn/courses/30/lessons/42747
    /*
        논문 n=5 편중 h번이상 인용된 논문이 h편 이상
        인용횟수(h) 배열 [3,0,6,1,5] => [0,1,3,5,6]
        인용횟수 h  해당논문보가 인용횟수가 같거나 많은 논문의 편수
        ========================================================
                           논문의 인용된 편수(0번이상 인용된게 5편 등등)
            0               5 X (전체편수 - i)
            1(번이상 인용)   4 X
            3               3 O - 최댓값
            5               2 O
            6               1 O
     */


import java.util.Arrays;

public class Hindex {
    /*
    public static int solution(int[] citations) {
        int answer = 0;
        
        // 인용횟수 배열 정렬
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length-i){
                System.out.println(Arrays.toString(citations));
                return citations.length - i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = {4, 0, 6, 1, 5};
        System.out.println(solution(A));
    }

     */
    public static int solution(int[] citations) {
        int answer = 0;

        // 인용횟수 배열 정렬
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] A = {4, 0, 6, 1, 5};
        System.out.println(solution(A));
    }


}
