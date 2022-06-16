package JavaStudyDate.day17.generic;
// 객체 생성전까지 어떤 바구니일지 모른다

// generic 클래스 : 객체가 생성될 때 타입이 결정된다
// - 제너릭 클래스는 타입의 안전성을 제공합니다.

// 다형성을 사용하면 모든걸 담아서 필요Xx
// 사과나 바나나'만' 담을 수 있는 바구니가 필요

// <F extends Fruit> 바스켓을 과일을 상속을 받은 것만 사용할 수 있음
public class Basket<F extends Fruit> {
    // 설정시에는 타입이 없음XX -> 객체가 생성됐을 시 알아차림
    
    // 필드 선언 - 보통 대문자로 한글자 + class네 <> 붙이기
    private F fruit;


    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
