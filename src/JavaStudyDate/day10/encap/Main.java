package JavaStudyDate.day10.encap;

public class Main {

    public static void main(String[] args) {

        // 필드를 열어둠면 외부에서 조작가능 -> private로 잠금
        // but 정상작동이나 데이터를 보는 모든 과정이 차단
        // 정상적인 범위내에서 변경하게 허용해야함


        Car myCar = new Car("그랜저");
//        myCar.speed = 10000;
//        myCar.mode = 'F';
        myCar.setSpeed(150);
        System.out.println("현재속도 : " + myCar.getSpeed());


        myCar.setMode('R');
        System.out.println("현재 모드: " + myCar.getMode());




    }


}
