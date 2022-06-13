package JavaStudyDate.day14.abs.pet;

import Utility.Util;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog("코초","푸들",3);
        Cat cat = new Cat("고양","러시안",2);

        dog.feed();
        dog.takenap();

        Util.line();

        cat.feed();
        cat.takenap();
    }
}
