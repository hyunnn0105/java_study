package JavaStudyDate.day15.inter;

// 인터페이스 : 객체의 규격(기능)을 표준화해서 명세하는 역할
// 인터페이스는 객체화될 수 없으며, 필드도 가질 수 없음
// 또한 상수와 추상메서드만 선언가능 = 상+추
public interface Pet {

    String PLAY_GROUND = "애견카페"; // 애완동물이 노는 장소
    // (public final) 숨겨짐 final은 초기화가 필수
    
    void play(); // 애완동물이 노는 기능
    
    // 강제 오버라이딩은 막을 수 있음
    default void smile(){}
    

}
