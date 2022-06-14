package JavaStudyDate.day15.inter;

public class BullDog extends Dog implements Pet,Huntable {
    @Override
    public void hunt(String target) {
        System.out.println("나는 불독,사냥이 가능한데");
    }
}
