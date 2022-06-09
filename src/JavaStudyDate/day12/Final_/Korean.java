package JavaStudyDate.day12.Final_;

public class Korean {
    
    String name; //이름
    // 내부에서도 주민번호 절대 교환불가
    final String id; // 주민번호

    // fianl만은 설정불가
//    final String nation; // 국적

    // 상수 : 불변성과 유일성 모두 만족
    // 상수 만드는 방법 : static + final 동시에 사용함
    public static final String nation;

    
    static {
        nation = "대한민국";
    }
    //생성자 = 초기화
    public Korean(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", id : " + id + ", 국적 : " + nation;
    }
    // 주민번호 바꾸는 메서드 - final은 변동불가
    public void changeId(String id) {
//        this.id = id;
    }
}
