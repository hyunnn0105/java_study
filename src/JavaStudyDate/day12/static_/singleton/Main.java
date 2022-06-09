package JavaStudyDate.day12.static_.singleton;

public class Main {
    public static void main(String[] args) {
        // 생성자의 갯수 제한 - 1개
        Controller c1 = Controller.getInstance();
        Controller c2 = Controller.getInstance();
        Controller c3 = Controller.getInstance();

        c1.number = 100;
        c2.number = 200;
        c3.number = 300;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
