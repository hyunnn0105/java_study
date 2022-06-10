package JavaStudyDate.day13.poly.castimg;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        parent.m2(); // 자식이 수정하기 전꺼 나옴

        System.out.println("====================================");

        Parent child = new Parent(); // - 부모객체로 변경시 m3 사용 못함
        // 업케스팅시 자식이 설정한 값을 사용하지 못하는 경우가 생김
        // but 오버라이딩은 가능

        // Child child = new Child();
        child.m1();
        child.m2(); // 자식이 수정한거 나옴
        // (((Child)child).m3()); // 자식이 정의한 값

    }


}
