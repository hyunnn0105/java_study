package JavaStudyDate.day08.player;

public class Main {

    public static void main(String[] args) {
        Player park = new Player("박찬호", 1, 50);
        Player kim = new Player("김철수", 1, 50);

//        System.out.println("kim = " + kim);
//        System.out.println("park = " + park);
        
        // this는 나의 객체를 가르킨다~
        // park.attack(kim);
        // kim.attack(park);
        kim.attack(kim);
        
        // 다양한 표현
        // 재활용은 안되지만 바로 정의해서 사용할 수 있다, 하지만 추천XX
//        kim.attack(new Player("냥냥니", 10,200));

//        park.name = "박찬호";
//        kim.name = "김철수";
//        park.level = 1;
//        kim.level = 1;
//        park.hp = 50;
//        kim.hp = 50;

    }
}
