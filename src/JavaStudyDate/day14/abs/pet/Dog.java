package JavaStudyDate.day14.abs.pet;

public class Dog extends Pet{
    
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }
    
    // 낮잠자는 기능의 오버라이딩 까먹음
    // -> 밥먹는 기능을 오버라이딩 + 시그니처를 다르게함 -> 에러
    public void feed(){
        // 오버라이팅 규칙
        System.out.println("강아지는 사료를 먹어요");
    }
    public void takenap(){
        System.out.println("마당에서 잠을 자요");
    }
}
