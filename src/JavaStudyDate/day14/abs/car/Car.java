package JavaStudyDate.day14.abs.car;

public abstract class Car {
    // 가속기능
    public abstract void accel();
    // 감속기능
    public abstract void brack();
    // 핸들열선기능 - abstract으로 강요 안해두됨 / 오버라이딩해서 수정도 가능함
    public void heatHendle(){
        System.out.println("온도가 10도까지 올라가요");
    }

}
