package codingtest.programmers.lev1;
// 숫자문자열과영단어
// https://programmers.co.kr/learn/courses/30/lessons/81301
/*
        //replace(old, new) : 문자열 내부에 old문자를 모두 탐색해서 new 문자로 변환
        String str3 = "p study, p app, p data";
        String replace = str3.replace("p", "java");
        System.out.println("replace = " + replace);
 */
// 문자열 문제가 자주 나와서 문자열과 관련된거 잘 봐두기
public class q9numStringNeng {
    public static int solution(String s) {
        String[] numberStr = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberStr.length; i++) {
            s = s.replace(numberStr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }


    public static void main(String[] args) {
        System.out.println(solution("2three45sixseven"));
    }
}
