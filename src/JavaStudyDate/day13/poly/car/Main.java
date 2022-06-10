package JavaStudyDate.day13.poly.car;

import Utility.Util;

public class Main {

    public static void main(String[] args) {
        // 타입을 다향성을 통해 통일시켜
        // 객체의 교환성이 증가한다.

        Car g1 = new granduer();
        Car g2 = new granduer();
        Car g3 = new granduer();

        Car m1 = new Mustang();
        Car m2 = new Mustang();

        Car s1 = new Stinger();
        Car s2 = new Stinger();

        // car의 값을 상속해서 car가 가장 상위개념이라
        // 형변환 없이도 들어감
        Car[] cars = {g1, g2, g3, m1,m2,s1,s2};
        for (Car c : cars) {
            c.run();
        }

        int a =1;
        long b = 2L;
        double c = 1.1;

        // object 타입의 배열에 기본 형식을 다 넣을 수는 있지만
        // 나중에 힘들다
//        Object[] aArr = {a,b,c};


        System.out.println("================");

        Driver kim = new Driver();
        kim.drive(new Stinger());

        kim.buyCar("머스탱").run();
        // run()이 void라 뒤에 추가 X

        new Driver().buyCar("머스탱").run();

        Car myCar = kim.buyCar("그랜져");
        myCar.run();

//        kim.drive(buyCar("그랜져").run());

        System.out.println("=======================");

        Mustang mm = new Mustang();
        Car cc = mm; // 업캐스팅
        mm = (Mustang) cc; // 다운캐스팅

        System.out.println("mm = " + mm);
        System.out.println("cc = " + cc);


        // 안되는 문법 - 부모객체를 자식타입으로 변환할 수 없음(절대불가)
        Car ccc = new Car();
        // mm = (Mustang) ccc;

        Util.line();

        // 하나 내릴 수 있음 - 상위타입 리턴이면 하나 내려서 쓰기
        Mustang myns = (Mustang) kim.buyCar("머스탱");
        myns.run();
        myns.joinMusclub();

        Util.line();

        Carshop shop = new Carshop();
        int money = shop.sellcar(new Mustang());
        int money1 = shop.sellcar(g1);
        System.out.println("money = " + money);
        System.out.println("money1 = " + money1);

        Util.line();
        // 오류 ClassCastException - 정확한 String만 넣는 것
        // cast(m1);
        cast("hi");
        // equals도 object 사용해서 비교함 그래서 ins of 로 비교


    }
    public static void cast(Object o){
        if (o instanceof String) {
            String s = (String) o;
            System.out.println("스트링변환 성공!");
        } else {
            System.out.println(" 스트링 변환 불가능");
        }
    }
}
