package JavaStudyDate.day15.inter;
// pet의 규격을 따른다
public class Cat extends Animal implements Pet{

    @Override
    public void play() {
        System.out.println("고양이는 캣타워에서 혼자 놀아요");
    }

    @Override
    public void eat() {
        System.out.println("고양이도 밥먹어");
    }
}
