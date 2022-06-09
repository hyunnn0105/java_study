package JavaStudyDate.day08.player;
//main-실행용
public class Player {

    String name; // 닉네임
    int level;
    int hp;

    // this = 나 자신 객체
    // this() = 나의 생산자
    
    Player () {
        // 이렇게 쓸거면 처음에 쓰자
        this("이름없음");
        System.out.println("1번 생성자 호출");
        // this.name = "이름없음";
//        this.level = 1;
//        this.hp= 50;
    }

    //이름 넣으면 기본 시작값 세팅
    Player(String name){
        this(name, 1, 50); //바로 아래 넘김 -> 코드 압축&모듈화
        System.out.println("2번 생성자 호출");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }

    Player(String pName, int pLevel, int pHp) {
        System.out.println("3번 생성자 생성");
        this.name = pName; // this.name 필드(String name;)랑 동일함
        this.level = pLevel;
        this.hp = pHp;
    }

    void attack(Player this, Player target){ 
        //Player this에 숨겨짐
        // 스스로 공격 방지
        // why == 사용? 주소값 비교하는거라 == 사용
         if (this == target) {
             System.out.println(" 스스로는 공격할 수 없습니다.");
             return;
         }

        // 출력메시지 x가 y를 공격한다
        // System.out.println("target = " + target); = kim
        // System.out.println("this = " + this); = park
        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);
        // 상대방의 체력을 10 낮추고 나의 체력을 5 회복한다
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("내 체력 : %d, 상대방 체력: %d\n", this.hp, target.hp);

    }
    
    // 캐릭터 정보 출력
    void info(){
        System.out.printf("이름: %s, 레벨 : %s, 체력: %d\n", name, level, hp);
    }
}
