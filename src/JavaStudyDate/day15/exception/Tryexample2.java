package JavaStudyDate.day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tryexample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수 1 : ");
            int n1 = sc.nextInt(); // warning - only 정수

            System.out.print("정수 2 : ");
            int n2 = sc.nextInt(); // warning

            int div = n1 / n2;
            System.out.println("div = " + div); // n2 = 0;일때 오류

            sc.close(); // sc가 null
            
            // 다중 멀티 예외 처리도 가능
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누지 말아라");
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력");
        } catch (NullPointerException e) {
            System.out.println("객체 초기화 확인");
        } catch (Exception e) {
            // 남은 에러를 기타등등으로 처리 -> 맨 마지막에 사용하기
            System.out.println("알수없는 예외 발생!");
        }
        System.out.println("종료");
    }

    
    
}
