package JavaStudyDate.day07op;
// 실행용 class
//day07object.PhoneFactory.main 메서드를 생성
public class PhoneFactory {

    public static void main(String[] args) {

        //phone 객체(인스턴스?) 생성 - 핸드폰 객체 타입(사용자정의)
        // Phone - 타입 / Phone(); - 생성자함수 why 호출?
        // 기능을 바로바로 사용할 수 있음
        Phone galaxy = new Phone();
        
        // 객체의 속성과 기능 참조( . 연산자(참조))
        // 클래스에서 직속선언-> 필드
        // galaxy.model = "갤럭시 S21";
        // galaxy.color = "펄 블루";
        // galaxy.price = 1000000;

        // galaxy.powerOn();
        galaxy.showSpec();

        System.out.println("==============================");
        // Phone(); 안에 스트링 넣기
        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("==============================");
        Phone gNote = new Phone("갤럭시노트", "제니레드");
        gNote.showSpec();

        System.out.println("====================================");
        Phone xhaomi = new Phone("샤오미 3.0", "화이트", 200000);
        xhaomi.showSpec();

    }

    public static class main {
    }
}
