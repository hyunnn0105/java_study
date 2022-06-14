package JavaStudyDate.day15.exception;

public class tryException1 {
    public static void main(String[] args) {
        int n1 = 10,n2 = 20; // 1
        System.out.println("나눗셈");
//        System.out.printf("%d / %d = %d\n", n1,n2,n1/n2);

        
        //2
        try {
            // 예외발생 가능성이 있는 코드
            System.out.printf("%d / %d = %d\n" ,n1 ,n2 ,n1/n2);
        } catch (ArithmeticException e) { // 처리할 예외에 대한 클래스
            // 예외 발생 시 실행할 코드
            System.out.println("0으로 나눌 수 없습니다");
            // 예외처리 후에 예외 로그 보고싶을 떄
            e.printStackTrace();
            // 전체로그 말고 예외 원인 메세지만 확인하고 싶을때
        }
        System.out.println("정상종료");

    }
}
