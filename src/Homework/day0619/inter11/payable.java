package Homework.day0619.inter11;

// 추상메소드가 하나 존재한다 - 함수형 인터페이스(추상메소드 하나)이다
@FunctionalInterface
public interface payable {
    long paySalary();
    
    // 수당을 준다
    default long payAllowance(){
        calllocal();
        return 0;
    }

    
    // 코드를 함수로 분리도 가능하다
    private void calllocal(){};

    static long testStatic(){
        return 1;
    }
}
