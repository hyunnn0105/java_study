package JavaStudyDate.day16.api.obj;
// 객체복사를 사용하려면 cloneable 인터페이스 구현

public class Pen extends Object implements Cloneable{
    Company company;
    long serial;
    String color;
    int price;

    public Pen() {
    }

//    public Pen(long serial, String color, int price) {
//        this.serial = serial;
//        this.color = color;
//        this.price = price;
//    }

    public Pen(Company company, long serial, String color, int price) {
        this.company = company;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // 일련번호 같으면 같다고 하기
    public boolean equslas(Object o){
        if (o instanceof Pen) {
            Pen p = (Pen) o;
            return this.serial == p.serial;
        }
        return false;
    }
    
    // clone 객체복사 : 얕은 복사 개념(해당포인터 객체만 복사)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // 깊은 복사 : 해당 객체 뿐만아니라 컴포지션된 객체도 모두 복사
    public Pen deepClone() throws CloneNotSupportedException {
        // 1. 우선 얕은 복사 진행
        Pen copy = (Pen) this.clone();
        // 2. 객체도 복사
        copy.company = (Company) copy.company.clone();
        return copy;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
