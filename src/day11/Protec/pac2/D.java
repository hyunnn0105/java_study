package day11.Protec.pac2;

import day11.Protec.pac1.A;

public class D extends A {

    public D() {
        super(30);
        A a = new A();
//        a.f1 = 3; 생성해서 지정하는건 막아둠

        super.f1 = 2;
//        super.f2 = 2; // default
        super.m1();
//        super.m2(); // default

    }
}
