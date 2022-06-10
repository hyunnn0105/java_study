package JavaStudyDate.day13.poly.basic;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Poly {


    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 타입이 달라도 연산됨
        A x1 = b;
        A x2 = new B();
        A x3 = c;
        A x4 = new D();
        A x5 = e;
        
        B v1 = new D();
        C y1 = new E();
        
//        B y3 = new E();
        // 상속관계가 아니면 다형성이 적용되지 않음
        // D y4 = new B();
        
//        object/A/C/E z1 = new E();
        // E는 4가지 사용할 수 있음
        // but 부모객체가 자식의 타입을 가질 수 없음
        
        // 강제 형변환
        double dd = 3.3;
        int nn = (int) dd;
        dd = nn;
    }
}
