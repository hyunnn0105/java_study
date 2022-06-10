package JavaStudyDate.day13.poly.castimg;

public class Child extends Parent{

    @Override
    public void m2(){
        System.out.println("오버라이딩 된 2번 메소드");
    }

    // 차일드만(자식)의 독립적인 메소드
    public void  m3(){
        System.out.println("자식의 3번 메소드");
    }




}
