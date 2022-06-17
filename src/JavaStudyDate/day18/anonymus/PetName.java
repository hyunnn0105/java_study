package JavaStudyDate.day18.anonymus;

public class PetName {
    public static void main(String[] args) {
        // new Pet(파라미터 자리);

        // 추상메서드가 2개 이상인 인터페이스는 람다 적용 불가능
        // 인터페이스는 언제나 하나!!
        Pet dog = new Pet() {
            String name;
            @Override
            public void play() {
                System.out.println("강아지는 산책하고 놀아요");
            }

            @Override
            public void eat() {
                System.out.println("강아지는 개껌을 먹어요");
            }
        };

    }
}
