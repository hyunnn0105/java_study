package JavaStudyDate.day19.lambda;

import java.util.ArrayList;
import java.util.List;

import static JavaStudyDate.day19.lambda.Apple.Color;

// 사과필터링 클래스
public class FilteringApple {
    /**
     * @solution try 1 - 사과리스트에서 녹색 사과들만 필터링해주세요
     * @problem
     * - 만약 빨간색 사과를 필터링하고 싶다면??
     * - filterRedApples를 만들것이냐?
     * - 색깔이 더 다양하다면?
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {

        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor() == Color.GREEN) {
                resultList.add(apple);
            }
        }
        return resultList;
    }

    /**
     * @solution - try2 : 색을 파라미터화 한다.
     * @problem
     *  - 만약 필터기준이 색상이 아니라 무게라면?
     *  - 무게 파라미터를 가진 메서드 filterApplesByWeight를 만들건가?
     *  - 만약 필터기준이 색상 + 무게
     *  - 어차피 조건문 빼고 코드가 똑같을 것 같은데?
     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        // 결과값 담기
        List<Apple> resultList = new ArrayList<>();
        // 인벤토리에 들어있는 값 돌리기
        for (Apple apple : inventory) {
            if (apple.getColor() == color) {
                resultList.add(apple);
            }
        }
        return resultList;
    }
    /**
     * @해결 - try3 : 동작 파라미터화 - 추상적 조건으로 필터링
     * a. 사과의 필터조건에 따라 참/거짓을 반환하는 추상메서드를 가진
     * Applepredicate 인터페이스를 정의ㅏㅁ
     * b. 특정조건을 설정할 구현클래스를 정의하고 기능을 오버라이딩
     * c. 위 내용을 기반으로 필터 메서드 사용
     * 
     * @문제1 - 필터조건당 클래스가 많음 -> 익명클래스로 해결
     * @문제2 - 필터 대상이 Apple이 아니라면?
     */

    //Solution a

    interface ApplePredicate{
        // 000이 참인가? - 사용자가 질문한게
        boolean test(Apple apple);
    }
    
    //Solution b
    // 사과의 무게가 100보다 큰지 확인
    static class AppleweightPredicate implements ApplePredicate{

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 100;
        }
    }

    static class AppleColorPredicate implements ApplePredicate{

        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == Color.RED;
        }
    }

    //Solution c                                         여기에 넣어주는 동작에 따라 검사하는게 달라진다
    public static List<Apple> filterList (List<Apple> inventory , ApplePredicate p){
        List<Apple> resultList = new ArrayList<>();
        // 인벤토리에 들어있는 값 돌리기
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                resultList.add(apple);
            }
        }
        return resultList;
    }
    /**
     * @Solution - try4 : 타입을 제네릭타입으로 처리
     */
    interface Predicate<T> {
        boolean test(T t);
    }
    
    // 제네릭 필터 메소드 생성
    //              <- 제네릭 만들때에는 다시 표시해주기? : 어떤타입이던 필터링가능
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        // 돌릴때 list에서 돌려서 result로 이동
        for (T t : list) {
            if (p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    // comparator.compaaring
}
