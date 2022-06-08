package JavaStudyDate.day08;

import JavaStudyDate.day08.fruit.Apple;
import JavaStudyDate.day08.fruit.Banana;
import JavaStudyDate.day08.fruit.Grape;
// 프로그램에서 '*'의 범위 -> 전체선택 / 프루츠의 모든 클래스를 가져옴

// 이거 있으면 애플 소환할때 생략가능 - 여기서 가서 사과를 가져와라

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        // 다른 패키지에 있는 클래스는 풀네임을 명시해야한다
        // 아니면 import 하던가~
        // 같은 패키지 소속이면 import 필요없음
        new Banana();
        new Grape();

        // Scanner도 외부라이브러리에 존재한다! 그래서 사용할때 import뜸
        new java.util.Scanner(System.in);

    }
}
