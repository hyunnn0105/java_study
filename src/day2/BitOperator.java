package day2;

public class BitOperator {
    public static void main(String[] args) {
        // 2진수 구하는 방법 찾기??
        // 비트 연산이 어디에 사용됨? 웹&모바일 중요X
        //  비트연산자
        byte a = 5; //0000 0101
        byte b = 3; //0000 0011

        // 정수는 비트연산, 논리는??
        // & (비트곱) : 각 비트 자리수를 곱하세요.
        System.out.println(a & b); // 답 : 1 / 0000 0001 = 1 (십진수변환) - 자릿수 곱하기?
        // | (비트합) : 각 비트 자리수를 더하세요 단 1+1=1로 처리
        System.out.println(a | b); // 답 : 7 / 0000 0111 = 7
        // ^ (배타적 논리합) : 각 비트 자리의 비트를 비교해서 다르면 1 같으면 0
        System.out.println(a ^ b); // 6 / 0000 0110 = 6

        // 비트 이동 연산 
        // << : 왼쪽으로 이동 - 2의 이동숫자만큼 제곱으로 곱해라
        // >> : 오른쪽으로 이동 - 2의 이동 숫자만큼 제곱으로 나눠라
        // 00000000 00000000 00000000 1100 0000
        int x = 192;
        // 00000000 00000000 0000-0110 0000 0000
        System.out.println( x << 3 ); //1536
        // 00000000 00000000 00000000 0011-0000
        System.out.println( x >> 2 ); //48


        //비트 반전 '~'(단항연산자)
        int y = 8;          // 0000 1000
        System.out.println(~y); // 답 : -9
        // 1(음수)111 0111 -> 1의 보수 10001000 -> 2의보수 1000 1001 -> 10진수?
        
        
        //조건연산자 (js에서 배움)

    }
}
