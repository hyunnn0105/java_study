package JavaStudyDate.day08.modi.pac1;

// class line에서는 public and default만 사용이 가능
public class B {
    // 여러개의 생성자를 만들때에는 같은 타입을 여러개 생성할 수 없음
    // 오버로딩 조건: 매개변수의 타입, 순서, 개수가 달라야함
    public B(String s) {};
    B(int x) {};
    private B(double d){};

    B(int y, int z) {};
    B(int y, String k) {}; // 순서바꾸면 가능
    B(String a, int k) {};


    // 자신의 생성자 모두 다 생성가능?
    B b1 = new B("zzz");
    B b2 = new B(100);
    B b3 = new B(5.5);

    void test() {
        A a = new A();


        a.f1 = 10; //public
        a.f2 = 20; //default
        // a.f3 = 30; //private

        a.n1(); //public
        a.n2(); //default
        // a.n3(); //private
    }
}
