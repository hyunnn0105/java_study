package JavaStudyDate.day15.inter;

public class Main {
    public static void main(String[] args) {
        // 인터페이스도 다형성을 적용할 수 있다 - 유사 상속(기능only)
        Dog dog = new Dog();
        Cat cat = new Cat();
        Shark shark = new Shark();
        Tiger tiger = new Tiger();
        BullDog bullDog = new BullDog();
        Rabbit rabbit = new Rabbit();
        
        // 객체를 ???
        Pet[] pets = {dog, cat, bullDog, rabbit};
        for (Pet pet : pets) {
            pet.play();
        }
        
        Violent[] violents = {rabbit, tiger, shark};
        for (Violent v : violents) {
            v.attack("공격");
        }
        
        // 인터페이스를 통해 객체의 기능을 제한할 수 있음
//        Pet tokki = new Rabbit(); -> attack 기능 막힘
        Violent tokki = new Rabbit();
//        tokki.play(); // Violent로 설정하면 play 기능 사라짐
        tokki.attack("주인");
        
        
        
        
    }
}
