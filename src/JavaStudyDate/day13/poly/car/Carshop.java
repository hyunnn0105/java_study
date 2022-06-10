package JavaStudyDate.day13.poly.car;

public class Carshop {
    // 차를 판매하는 기능
    public int sellcar(Car car) {

        if ( car instanceof granduer) {
            // 카가 그렌져의 인스턴스인지 식별할때 사용
            return 2000;
        } else if (car instanceof Mustang) {
            return 3000;
        } else if (car instanceof Stinger) {
            return 3100;
        } else {
            return 0;
        }
    }
}
