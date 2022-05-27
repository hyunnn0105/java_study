package codingtest.programmers.lev1;

// 하샤드 수
public class q2 {
    public static boolean solution(int x) {
        // 모든 자릿수의 합 구하기


        // 입력받은 수 % 자릿수의 합 ==0 ture;
        boolean answer = true;
        // ture/false니까 while쓰기
        return answer;

    }

    public static void main(String[] args) {
        // System.out.println(solution(answer));
        int x = 123; //초기X값 백업
        String leng = String.valueOf(x);
        int total = 0;
        int i = 0;
        for (i = 0; i < leng.length(); i++) {
            total += x % 10;
            x /= 10;
        }
        // return x%total == 0;
        System.out.println(total);

        System.out.println(i);
    }
    
}
