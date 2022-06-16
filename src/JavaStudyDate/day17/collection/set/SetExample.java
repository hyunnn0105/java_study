package JavaStudyDate.day17.collection.set;

import Utility.Util;

import java.util.*;

// collection 인터페이스 상속해서 명령어 동일
public class SetExample {
    public static void main(String[] args) {
        // Set : 중복저장을 허용하지 않는다. 데이터 삽입 속도가 빠름, 순서없이 저장
        // 중복된 받은 데이터 삭제
        Set<String> set = new HashSet(); // hash구조 set - 정렬이 필요할 시 트리구조 사용

        // add(E e) : 객체 추가
        set.add("김말이");
        set.add("닭꼬치");
        set.add("단무지");
        // 중복된 key 객체를 put하면 value가 false
        boolean b1 = set.add("김말이"); // 김말이 2개를 하나로 침
        boolean b2 = set.add("김밥");

        System.out.println(set.size());
        System.out.println(set);
        // [김밥, 김말이, 단무지, 닭꼬치] 순서가 엉망 - 위치생각X

        // 추가 성공 실패를 boolean으로 알려줌
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        Util.line();

        // Set의 루프 처리 - iter 
        // 하나 딱집에서 찾기 힘듬
        // Iterater<> 이런 클래스도 잇음

        for (String s : set) {
            System.out.println(s);
        }

        // remove() : 
        // 인덱스가 없어서 객체 직접 지정해서 삭제해주기

        set.remove("단무지");
        System.out.println(set);

        // 수정은 불가능!!
        set.clear();
        System.out.println(set.isEmpty());

        List<Integer> numberList = new ArrayList<>(
                Arrays.asList(2, 2, 2, 2, 4, 4, 4, 5, 5, 6, 6, 8, 9));

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);



        // 여러군데 넣어서 활용할 수 있음
        /*
        numberList.clear();
        numberList.addAll(numberSet);
        System.out.println(numberSet);

             */

    }
}
