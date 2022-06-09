package JavaStudyDate.day12.static_;

public class Count {
    public int X; // 인스턴스 필드
    public static int Y; // 정적필드
    // static 은 고정값으로 아무리 객체를 생성해도
    // 객체의 값이 동일하다 - Y의 저장공간은 하나!
    
    public void m1(){ // 인스턴스 메서드
        System.out.println("X = " + this.X);
        System.out.println("Y = " + Y); // 똑같은 Y값을 가져서 this 성립X
    }
    
    // static 블록(메서드, 정적 초기화자)에서는 
    // static 필드만 참조가능
    // static 블록은 생략되는 this를 사용할 수 없음
    // 클래스별로 단 하나
    // 객체생성없이 호출하기도 해서 내가 쓰는 X의 값을 정해야 m2()를 할 수 있음
    // static 안에서는 무조건 static 이여야함!!
    public static void m2(){ // 정적 메서드
        Count c = new Count();
        System.out.println("X = " + c.X);
        System.out.println("Y = " + Y);
    }
}
