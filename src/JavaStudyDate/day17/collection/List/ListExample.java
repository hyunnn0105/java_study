package JavaStudyDate.day17.collection.List;

import Utility.Util;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // 배열리스트 생성 - 초기 생성시 10개의 공간이 주어지고
        // 데이터 추가시 동적으로 늘어난다
        
        // ArrayList - 삽입삭제느림/탐색이 빠름
        // LinkedList - 삽입삭제빠름
        List<String> sList = new ArrayList<>();
        
        // add(E e) : 리스트의 맨 끝에 객체를 추가한다
        // 리스트 계열은 중복데이터 저장이 가능

        sList.add("멍멍이");
        sList.add("야옹이");
        sList.add("짹짹이");
        sList.add("두껍이");
        sList.add("개굴이");
        sList.add("야옹이");

        System.out.println(sList);

        // size() : 저장된 객체의 수 리턴
        int size = sList.size();
        System.out.println("size = " + size);
        
        // add(int index, E e) : 데이터 중간 삽입
        // 야옹이랑 짹짹이 사이
        sList.add(2,"어흥이");

        System.out.println("sList = " + sList);

        // set(index, obj) : 객체수정
        sList.set(3,"메롱이");
        System.out.println(sList);

        // remove(index), remove(obj)
        sList.remove(1); // 야옹이가 사라짐
        sList.remove("개굴이"); // 개굴이 사라짐
        System.out.println(sList);
        
        // get(index) : 객체참조
        String s = sList.get(2);
        System.out.println(s);
        
        // indexof(obj) : 저장된 객체의 인덱스를 리턴, 없으면 -1
        int idx = sList.indexOf("어흥이");
        System.out.println("idx = " + idx);

        // contains(obj) : 객체의 저장 유무 확인
        boolean flag = sList.contains("두깝이");
        System.out.println("flag = " + flag);
        
        // list의 루프처리
        Util.line();

        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        Util.line();

        // iter for문도 사용가능하다
        for (String ss : sList) {
            System.out.println(ss);
        }
        
        // clear() : 리스트 내부 전체삭제
        sList.clear();
        // ex) game 길드 해체? 해산? 같은 느낌

        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());
        // sList = null     // 리스트 자체를 삭제한다

        // 초깃값을 가진 리스트 생성
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10,20,30,5,8,56,2)
        );
        System.out.println(numbers);
        
        // 배열만들기
//        Integer[] obj = (Integer[]) numbers.toArray();
        
        // 오름차 정렬 - 람다?
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
        
        // 2차원 리스트
        List<List<Integer>> list2d = new ArrayList<>();
        
        // 2차원리스트에 1차원 리스크를 추가
        list2d.add(new ArrayList<>(Arrays.asList(10,20,30)));
        list2d.add(new ArrayList<>(Arrays.asList(40,50,60)));
        list2d.add(new ArrayList<>(Arrays.asList(70,80,90)));
        
        // 2차원 리스트 1번째 1차원 리스트에 정수 추가
//        list2d.get(0).add(10);
//        list2d.get(0).add(20);
//        list2d.get(0).add(30);
        Util.line();

        for (List<Integer> list : list2d) {
            for (int n : list) {
                System.out.printf("%d",n);
            }
            System.out.println();
        }
    }
}
