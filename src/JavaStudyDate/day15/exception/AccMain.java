package JavaStudyDate.day15.exception;

public class AccMain {
    public static void main(String[] args) throws BalanceInsufficientException{

        Account acc = new Account();
        
        // 에러만들어서 내보내기 - 오류 검증도 가능
        // - 자바 시스템 내에 없는 에러도 만들 수 있음
        try {
            acc.withdraw(10000);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        /*
        try {
            acc.withdraw(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

         */
    }
}
