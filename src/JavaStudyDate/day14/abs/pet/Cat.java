package JavaStudyDate.day14.abs.pet;

public class Cat extends Pet{
    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    // 낮잠자는 기능의 오버라이딩 까먹음
    // -> 밥먹는 기능을 오버라이딩 + 시그니처를 다르게함
    public void takenap(){
        System.out.println("고양이는 캣타워에서 자요");
    }
    public void feed(){
        System.out.println("고양이 밥먹어요");
    }
}
