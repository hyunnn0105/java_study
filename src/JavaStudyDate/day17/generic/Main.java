package JavaStudyDate.day17.generic;

public class Main {

    public static void main(String[] args) {
        // 과일 생성시 따로따로 생성함
        // 과일이 생길때마다 바로바로 생성? -> 정의 필요X
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

        // 지금 만드는 바구니는 사과 전용~
        //<>안에 있는게 basket의 F로 들어감
        Basket<Apple> ba = new Basket<>();
        ba.setFruit(new Apple());
        Apple a1 = ba.getFruit();

        Basket<Banana> bbb = new Basket<>();
        bbb.setFruit(new Banana());
        Banana b1 = bbb.getFruit();

//        Basket<Toy> tb = new Basket<>();



    }
}
