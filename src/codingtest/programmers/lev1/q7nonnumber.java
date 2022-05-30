package codingtest.programmers.lev1;
// 없는숫자더하기
// https://programmers.co.kr/learn/courses/30/lessons/86051
public class q7nonnumber {
        public static int solution(int[] numbers) {
            // 없는 숫자구하기 = 총합 - 있는숫자합
            int sum = 0;
            for (int i = 0; i <= 9; i++) {
                sum += i;
            }
            // 있는 숫자의 합
            for (int n : numbers) {
                sum -= n;
            }
            return sum;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4 ,6,7,8 };
        System.out.println(solution(nums));
    }
}
