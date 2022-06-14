package JavaStudyDate.day15.exception;
// 사용자 정의 예외 클래스
// 0. 클래스 명 정할 때 뒤에 Exception 붙여서 에러처럼 만들기
// 1. Exc 상속받기
public class BalanceInsufficientException extends Exception{
    // 2. 기본 생성자 생성
    public BalanceInsufficientException() {
    }
    // 3. 에러메세지를 담을 생성자
    public BalanceInsufficientException(String message) {
        super(message);
    }
}
