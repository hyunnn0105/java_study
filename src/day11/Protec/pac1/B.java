package day11.Protec.pac1;

public class B {
    public B(){
        // 모든 기능에 접근 가능
        A a = new A();
        a.f1 = 1;
        a.f2 = 2;
        a.m1();
        a.m1();
        new A(1);
        new A(2.2);
    }
}
