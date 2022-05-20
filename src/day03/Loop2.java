package day03;

public class Loop2 {
    public static void main(String[] args) {
        // 중첩반복문
        // 레이블 - 반복문에 이름 붙여서 탈출
        apple : for ( char upper = 'A'; upper <= 'Z'; upper++) {
            for ( char lower = 'a'; lower <= 'z'; lower++) {
                if (lower == 'f') break apple;
                // 대문자는 계속해서 진행 -> 소문자 탈출
                // => 가장 가까운 반복문 탈출
                System.out.printf("%c - %c\n", upper, lower);
            }             //inner for
            // if (upper == 'D') break;
        } //outer for

    }
}
