package JavaStudyDate.day13.poly.basic;

class Monitor{}
class LgMonitor extends Monitor{}
class HpMonitor extends Monitor{}

public class Computer {
    // 부모의 자식이 여러명이면 자식들은 하나의 타입으로 통일 할 수 있다
    LgMonitor monitor;
    
    Computer(){
        this.monitor = new LgMonitor();
    }
    void changeToHpcomputer(){
        // 호환이 안되서 오류남 but 부모타입 모니터
//        this.monitor = new HpMonitor();
    }
}
