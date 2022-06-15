package JavaStudyDate.day16.api.string;

import Utility.Util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {

        String s = "1 2 3 4";
        // 문자열 쪼개기 방법 1 - 정규표현식??
        String[] sArr = s.split(" "); // 띄어쓰기를 기준으로 쪼개서 배열로 줌
        int[] number = new int[sArr.length];
        // 문자배열에 있는 수 인트배열에 넣기
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(sArr[i]);
        }
        System.out.println(Arrays.toString(sArr));

        Util.line();

        // **문자열 쪼개기 2번 - 스트링토크나이저? (큐같은곳에 담아줌-하나씩 빼기)
        s = "짜장면,탕수육,볶음밥,라면,김밥";
        StringTokenizer st = new StringTokenizer(s,",");

        String[] foods = new String[st.countTokens()];

        // for문도 t/f가 나오는 식(논리값)들이면 사용가능하다!
        for (int i = 0; st.hasMoreTokens(); i++) {
            foods[i] = st.nextToken();
        }
        System.out.println(Arrays.toString(foods));

        // 빌때까지 돌아라 - 더이상 소비할 토큰이 없을때가지
//        while (st.hasMoreTokens()){
//            System.out.println(st.nextToken()+ " ");
//        }
//        st.nextToken();
//        System.out.println(st.countTokens());

//        while (st.nextToken() != null) {
//            System.out.println(st.nextToken() + " ");
//        }

        // for문 무한루프
//        for(;;){}

        Util.line();

        long ss = System.currentTimeMillis();
//        String str = ""; //3100ms
        StringBuilder sb = new StringBuilder(); // 빌더가 결합연산(문자열 더하기?)시 빠르다
        for (int i = 0; i < 100000; i++) {
//            str += (i+1);
            sb.append(i+1);
        }
//        String sss = sb.toString(); // 스트링 쓸일 있으면 빌더를 스트링으로 바꿔서 써라
        long ee = System.currentTimeMillis();
        System.out.println((ee-ss)+"ms");
    }
}
