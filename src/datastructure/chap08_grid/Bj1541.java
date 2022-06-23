package datastructure.chap08_grid;
/*
    양수, + , - , *()*
    괄호위치 => 이 식의 값을 최소
    괄호가 55-(50+40) 이런거면 최소값?
    그리고 연속해서 두 개 이상의 연산자가 나타나지 않고
    5자리보다 많이 연속되는 숫자는 없다.
    
    - 최대한 큰 수를 '-'로 묶어야함
       - 기준으로 쪼개기
       + 기준으로 쪼개기 = 합치기
 */

import java.util.StringTokenizer;

public class Bj1541 {
    public static void main(String[] args) {

        // 문자열로 입력받기
        String num = "55-50+40";
        StringTokenizer st = new StringTokenizer(num,"-");
        String[] sarr = new String[st.countTokens()];

        int result = 0;
        for (int i = 0; st.hasMoreTokens(); i++) {
            String token = st.nextToken();
            int add = calctotal(token);

            if (i == 0) {
                result += add;
            } else {
                result -= add;
            }
        }
        System.out.println(result);

    }
    // 토큰 문자열을 받아서 총합을 구해서 리턴
    private static int calctotal(String token){
        int total = 0;
        StringTokenizer st = new StringTokenizer(token, "+");
        while (st.hasMoreTokens()){
            total += Integer.parseInt(st.nextToken());
        }
        return total;
    }

}
