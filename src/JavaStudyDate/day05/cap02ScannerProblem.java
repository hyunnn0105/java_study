package JavaStudyDate.day05;

import java.util.Scanner;

public class cap02ScannerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력이 100 + '\n'으로 들어감 but 이게 다음줄로 넘어감
        System.out.printf("정수: ");
        int n = sc.nextInt();

        // => nextInt의 잔여공백을 처리하고 넘어가야함 - 의도적으로 넣어주기
        sc.nextLine();

        //nextInt 다음에 nextLine 입력 불가
        // nextint에 남은 \n이 아래로 타고 내려옴** 문제
        System.out.printf("문자열 : ");
        String s = sc.nextLine();

        System.out.println("s = " + s);
        sc.close();

        System.out.println();
    }
}
