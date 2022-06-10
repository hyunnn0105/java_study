package JavaStudyDate.day13.poly.overloading;

public class Main {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();

        System.out.println(rc.calcArea(5));
        System.out.println(rc.calcArea(10,5));

        rc.calcArea("", 1);

        System.out.println();
    }
}
