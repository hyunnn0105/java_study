package JavaStudyDate.day08.modi.pac2;

import JavaStudyDate.day08.modi.pac1.A;
import JavaStudyDate.day08.modi.pac1.B;

public class C {

    B b1 = new B("zzz"); //public- class default
    // B b2 = new B(100);
    // B b3 = new B(5.5);

    void test() {
        A a = new A(); // A와 C는 다른 패키지 소속
        a.f1 = 10; //public
        // a.f2 = 20; //default
        // a.f3 = 30; //private


        a.n1(); //public
        // a.n2(); //default
        // a.n3(); //private


    }
}
