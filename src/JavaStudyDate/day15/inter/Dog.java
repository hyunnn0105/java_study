package JavaStudyDate.day15.inter;
// 실제로 사용할 객체 - 주체적
// 구현클래스가 인터페이스를 구현할 때는 implements 키워드 사용
public class Dog extends Animal implements Pet{

    @Override
    public void play() {
        System.out.println("강아지는 꼬리를 흔들며 놀아요");
    }

    @Override
    public void eat() {
        System.out.println("강아지는 밥도먹어");
    }
}
