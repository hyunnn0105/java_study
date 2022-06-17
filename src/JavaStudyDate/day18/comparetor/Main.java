package JavaStudyDate.day18.comparetor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> pList = new ArrayList<>();
        pList.add(new Person("김철수1",33));
        pList.add(new Person("하하하",41));
        pList.add(new Person("박박박",11));
        pList.add(new Person("김송희",21));
        
        // 가나다순정렬 or 나이정렬?? 어케하지
        // 어제 List 참고
        
        // 나이순으로 오름차 정렬 (나이 적은 순)
        
        // 1. 클래스 생성
        // @FunctionalInterface => 추상메소드 하나 잇다
//        pList.sort(new AgeAscendingComparator());

        // 2. 익명클래스
//        pList.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        
        // 3.람다 (나이 오름차)
        pList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        
        // 나이내림차
        pList.sort((o1, o2) -> o2.getAge() - o1.getAge());

        // 이름 오름차
//        pList.sort(new NameAscendingComparator());

//        pList.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        // 이름 오름차
        pList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        
        // 이름 내림차
        pList.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));



        for (Person p : pList) {
            System.out.println(p);
        }

    }
}
