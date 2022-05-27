package day08.modi.pac1;

public class A {
    // 필드 선언
    public int f1;
    int f2; // 설정X -> default 제한
    private int f3; // aClass 안에서만  사용가능

    // 메서드 선런
    public void n1() {}
    void n2() {} // 설정X -> default 제한
    private void n3() {}

    // 생성자
    public A() {
        f1 = 10;
        f2 = 20;
        f3 = 30;

        n1(); n2(); n3();
    }

    B b1 = new B("zzz");
    B b2 = new B(100); // 같은 패키지
    // B b3 = new B(5.5); private

    // 클래스의 구성요소 (필드, 생성자, 메서드)에는 제한자를 사용할 수 있음
    //
}
