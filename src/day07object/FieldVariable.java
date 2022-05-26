package day07object;

public class FieldVariable {
        int a; // field
        /*
            - 지역변수는 반드시 초기화가 되어있어야 참조가 가능합니다 - 안하면 기본값
            - 필드는 초기화를 하지 않아도 자동으로 각 타입의 기본 값으로 초기화 됩니다.
            - 매개변수는 메서드 호출시 강제로 값이 대입되므로 따로 초기화할 필요가없다.
         */
        
        void m1(int c) { //parameter
            int b = 1; //local variable 지역변수
            System.out.println("a = " + a);
            System.out.println("b = " + b); //  b랑 c는 main에서 사용XXX 여기서 나가면 죽어
            System.out.println("c = " + c);
        }

    public static void main(String[] args) {
        FieldVariable fv = new FieldVariable();
        fv.m1(10);
    }

}
