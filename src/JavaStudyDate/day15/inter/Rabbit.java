package JavaStudyDate.day15.inter;
// 규격은 똑같지만(통일화되어 있지만) 내부 구현은 다르게 할 수 있음
public class Rabbit extends Animal implements Pet, Violent{
    @Override
    public void eat() {
        System.out.println("");
    }

    @Override
    public void play() {

    }

    @Override
    public void attack(String target) {

    }
}
