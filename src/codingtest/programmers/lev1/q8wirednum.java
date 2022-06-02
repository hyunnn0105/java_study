package codingtest.programmers.lev1;
// 이상한 문자 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12930
// 하나 이상의 공백 -> 공백이 여러개일수있음
// 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
// 첫글자가 짝(대) / 두번째 홀수(소)
// 한글자씩 뜯기 - charAt()
// 공백은 무시

/*
    -의사코드
     의사코드(Pseudo-code)
    실제 프로그래밍 언어와 유사한 언어로 작성된 코드
    자연어 사용의 단점 해결
    하지만 직접 실행할 수 없음.

    각 단어의 위치를 기억할 변수 count 선언 초깃값 0
    for(문자열.len) {
        if(' ') {
            count = 0;
            }
        else {
           count += 1;
           홀수 = 대문자 변환
           짝수 = 소문자 변환
        }
        변환한 문자 하나의 문자열로 저장
 */


public class q8wirednum {
    public static String solution(String s) {
        //단어위치 ㅣㄱ억
        int count = 0;
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            // 한글자씩 추출
            char c = s.charAt(i);
            count = (c == ' ') ? 0 : count + 1;
            // c를 문자열로변환
            String ss = String.valueOf(c);
            answer += (count % 2 == 1) ? ss.toUpperCase() : ss.toLowerCase();
        }

        // 아스키코드 계산
        // 'a'-32 = 'A'
        // 'A'+32 = 'a'
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
