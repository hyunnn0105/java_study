package day08.driver;

// import day08.car.엔진;
import day08.car.딜러;
import day08.car.자동차;

public class 운전자 {

    // 운전자가 할 수 있는 기능 제한
    자동차 내차;
    private String 비밀일기; // 운전자만 봐야함

    void 운전하다(){
        내차.시동을걸다();
        // 내차.엔진오일을_분사하다();
        // 내차.v6엔진 = new 엔진();

        // 내차 = new 자동차(); - 운전자가 자동차 만들기 XXX
    }
    // 차 생산XX
    void 차를_구매하다(딜러 착한딜러){

        착한딜러.차를_판매하다(100000000);
    }
}
