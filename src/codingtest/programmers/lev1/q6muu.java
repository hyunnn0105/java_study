
package codingtest.programmers.lev1;
// 음양 더하기
// https://programmers.co.kr/learn/courses/30/lessons/76501

public class q6muu {
    public static int solution(int[] absolutes, boolean[] signs) {
        // 알고리즘test할때 long으로 잡기->공간문제해결
        long total = 0;
        for (int i = 0; i < absolutes.length; i++) {
            // 부호가 붙은 원래 숫자
            int n = signs[i] ? absolutes[i] : -absolutes[i];
            total += n;
        }
        //downcasting
        return (int)total;
        
        /*
        총합저장변수
            for (ab 배열 크기) {
            signs 논리값확인-> absolutes배열의 정수값에 부호
                    ->총합에 누적
        }
        -> 총합리턴
         */

    }

    public static void main(String[] args) {
        int[] nums = {4,7,12};
        boolean[] barr = {true, false, true};
        System.out.println(solution(nums, barr));
    }

}
