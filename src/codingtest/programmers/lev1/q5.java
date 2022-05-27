package codingtest.programmers.lev1;

public class q5 {
    public static String solution(int a, int b) {
        String answer = "";
        String[] arr = {"THU","FRI","SAT", "SUN","MON","TUE","WED"};
        // 월 별 총 일수
        int[] th = {31,29,31,30,31,30,31,31,30,31,30,31};

        int total = 0;
        // 4월까지의 합 + 24(b)
        for (int i = 0; i < a-1; i++) {
            total += th[i];
        }
        int yearleng = total+b;
        // System.out.println(yearleng);
        
        int i = yearleng % 7;
        answer = arr[i];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
}

// 7로 나누면 나머지가 1 -> 금 / 2-> 토 / 3 -> 일 / 4 -> 월/ 5->화/6->수 /목요일 -> 0
// 2월 5일 => 1년중에 36번째날을 7로 나눈 나머지 1
// 1년중에 몇번째 날인지 변환하기
// 5월 24일 일년중에 월별로 나누시 처리 반복
// 31 + 29 + 31 + 30 + 24 = 145
// 145 % 7 = 5, 5 = 화


