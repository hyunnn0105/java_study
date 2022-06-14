package codingtest.programmers.lev1;


public class handphonenum {
    public static String solution(String phone_number) {
        String answer = "";

        //맨 뒤 4자리 추출
        String last4 = phone_number.substring(phone_number.length()-4);
        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += last4;

        return answer;
    }
    // 끝에 4개만 마킹
    public static void main(String[] args) {

        System.out.println(solution("027778888"));
    }
}
