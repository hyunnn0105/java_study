package Homework.day01;

import JavaStudyDate.day12.Final_.Ma;
import Utility.Util;

import java.util.*;

public class ListAndMap {
    public static void main(String[] args) {
        // list 사용
        List<String> mylist = new ArrayList<>();
        mylist.add("red");
        mylist.add("blue");
        mylist.add("green");
        mylist.add("yellow");
        //바로 출력해도 콘텐츠의 값이 보임 [red, blue, green, yellow]
        System.out.println(mylist);

        mylist.add("black");

        String thrid = mylist.get(2);
        System.out.println(thrid);

        // 전체삭제
//        mylist.clear();
        System.out.println(mylist);


        // immutable List - read only
        List<String> readOnly = Collections.unmodifiableList(mylist);
        System.out.println(readOnly);

        // readOnly.add("white"); // .UnsupportedOperationException - 언뮤터블 설정해서 실행불가
        System.out.println(readOnly);


        Util.line();
        // Java9 of 메소드 사용 : 생성시 임뮤터블하게 설정해줌
        List<String> javaNine = List.of("red", "blue", "green");
        System.out.println(javaNine);
//        javaNine.add("white");


        System.out.println("=================== Map ===================");
        // MAp - hashMap
        // 제너릭 타입(키,데이터 타입 설정해주기)
        Map<String, String> myMap = new HashMap<>();
        myMap.put("i5","아이폰5");
        myMap.put("i6","아이폰6");
        myMap.put("i7","아이폰7");
        System.out.println(myMap);

//        myMap.clear();

        // 임뮤터블 맵
        Map<String, String> ImmutableMymap = Collections.unmodifiableMap(myMap);

        //java9 of method
        Map<String, String> java9 = Map.of("i5","아이폰5",
                "i6","아이폰6",
                "i7","아이폰7");
        // put 실행불가
        System.out.println(java9);
    }
}
