package day07object;

public class Phone {
    // 설계용 class
    // 실행용 class


    // 속성: 객체의 데이터 (field)

    // 고유 속성
    String model; // 모델명
    String color; // 색상명
    int price;    // 가격

    // 상태 속성
    int messageCount; // 받은 문자메세지의 수
    boolean on; // 전원이 켜진지의 여부

    // 부품 속성
    // 문자메시지함
    String[] receiveMessages = new String[3];
    
    //생성자 constructor : 객체의 초기화를 담당하며, 객체의 생성시 반드시 호출
    // 하나도 선언하지 않을 시 자동으로 기본생성자 생성
    // 생성자이름=class 명 - void함수가 기본값이라 작성X
    // 만들자마자 쓸 수 있도록 객체 셋팅
    // 기본생성자 : 매개변수가 없는 생성자
    Phone() {
        System.out.println("1번 생성자 호출!");
        model = "애니콜";
        color = "그래이";
        price = 120000;
        powerOn();
        Math.random();
    }

    //생성자 오버로딩 - 생성자 중복선언 가능, 매개변수가 달라야함
    Phone(String pModel){
        System.out.println("2번 생성자 호출");
        model = pModel;
        color = "사파이어";
        price = 50000;
        powerOn();
    }
    Phone(String pModel, String pColor) {
        model = pModel;
        color = pColor;
        price = 80000;
        powerOn();
    }
    Phone(String pModel, String pColor, int pPrice) {
        model = pModel;
        color = pColor;
        price = pPrice;
        powerOn();
    }
    

    // 기능: 객체의 행위, 동작 (method)
    // 설계도의 메서드는 static을 붙이지 말 것!


    // 전원을 켜는 기능
    void powerOn() {
        on = true;
        System.out.println(model +"의 전원을 켭니다.");
    }


    void powerOff() {
        on = false;
        System.out.println(model +"의 전원을 끕니다.");
    }

    // 핸드폰 정보를 알ㄹ려주는 기능
    void showSpec(){
        if (!on) {
            System.out.println(model+"의 전원을 먼저 켜라");
            return;
        }
        System.out.println("\n# 휴대폰 정보");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price);

    }

    // 메세지를 보내는 기능
    // 아이폰.메세지보낸다(갤럭시, 메세지 내용)
    void sendMessage(Phone targetPhone, String msg) {
        // 상대방의 메세지 함이 가득 차있는지를 확인
        //receiveMessages스트링배열
        if (targetPhone.receiveMessages.length > targetPhone.messageCount) {
            // 상대방 메세지 함에 메세지 넣기 -> 상대방 의 메세지카운트 ++
            targetPhone.receiveMessages[targetPhone.messageCount++] = msg + "by : " + model;
        } else {
            // 가득 찬 경우
            System.out.println(targetPhone.model + "의 메세지함이 가득 찼습니다.");
        }
    }
    // 수신메시지를 확인하는 기능
    void checkMessages() {
        System.out.printf("\n========= [%s]의 메시지함 ==========\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }

} // end
