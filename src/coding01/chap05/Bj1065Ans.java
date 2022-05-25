package coding01.chap05;

import java.util.Scanner;

public class Bj1065Ans {
    // 정수의 자릿수를 구해서 리턴하는 함수
    static int countDigit(int n) {
        int cnt = 0;
        while (n > 0) {
            n /= 10;
            cnt++;
        }
        return cnt;
    }

    //정수n을 전달하면 각 자리수별로 쪼개서 배열로리턴하는 함수
    // 길이는 contdig 가져오기
    // for문으로 하나씩 빼기 - 끝부터 나눠서 나머지 넣어주기
    // =========
    // 정수n을 전잘하면 갭을 담아 리턴
    // 갭리턴
    // for문으로 gap = num1-num2
    // 생각을 단계별로 쪼개기

    // 정수 n을 전달하면 각 자리수별로 쪼개서 배열로 리턴하는 함수
    static int[] splitNumber(int n) {
        int[] numbers = new int[countDigit(n)];
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = n % 10;
            n /= 10;
        }
        return numbers;
    }

    // 정수 n을 전달하면 각 자리수의 공차를 배열에 담아 리턴하는 함수
    static int[] makeGaps(int n) {
        int[] numbers = splitNumber(n);

        // 공차들을 저장할 배열
        int[] gaps = new int[numbers.length - 1];

        // n = 5724, numbers = [5,7,2,4]
        /*gaps[0] = numbers[0] - numbers[1]; // -2
        gaps[1] = numbers[1] - numbers[2]; // 5
        gaps[2] = numbers[2] - numbers[3]; // -*/

        for (int i = 0; i < gaps.length; i++) {
            gaps[i] = numbers[i] - numbers[i + 1];
        }

        return gaps;
    }

    // 정수 n을 전달하면 한수인지의 여부를 판단해주는 함수
    static boolean isHansu(int n) {
        int[] gaps = makeGaps(n);

        // n = 12345  , gaps = [-1, -1, -1, -1]
        /*gaps[0] == gaps[1]
        gaps[1] == gaps[2]
        gaps[2] == gaps[3]*/

        for (int i = 0; i < gaps.length - 1; i++) {
            if (gaps[i] != gaps[i+1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 한수를 판별할 끝범위 수
        sc.close();

        int count = 0; // 한수의 개수를 카운팅
        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                count++;
                continue;
            }
            if(isHansu(i)) {
                count++;
            }
        }

        System.out.println(count);
    }


}
