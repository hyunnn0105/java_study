package JavaStudyDate.day14.abs;

public class Child extends Parent {
    public String nation;

    public Child() {
        // this() or super() 하나만 쓰기
        this("홍길동");
        System.out.println("Child() call"); // 4번
    }

    public Child(String nation) {
        // super()가 숨겨져 있음 -> 2/1
        this.nation = nation;
        System.out.println("Child(String) call"); // 3번
    }
}
