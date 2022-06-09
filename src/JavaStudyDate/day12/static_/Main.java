package JavaStudyDate.day12.static_;

public class Main {
    public static void main(String[] args) {
        // 객체 생성없이 접근할 수 있음
        System.out.println(Count.Y);
        System.out.println(Math.PI);
        // public static final double PI = 3.14159265358979323846;
        // static 으로 그냥 바로 class 불러올 수 있음 (하나로 공유됨!!)


        Count c1 = new Count();
        c1.X = 10;
        c1.X++;

        c1.Y = 20;
        c1.Y--;

        Count c2 = new Count();

        c2.X = 100;
        c2.Y = 200;

        System.out.printf("c1.x : %d, C1.y : %d\n", c1.X, c1.Y);
        System.out.printf("c2.x : %d, C2.y : %d", c2.X, c2.Y);

        // C1.Y = C2.Y
        // 굳이 인스턴스(객체화)를 만들 필요가 없어서 그냥 클래스로 접근
        
        // count class의 객체 / 카운트 클래스를 통해 호출
        c1.m1();
    }
}
