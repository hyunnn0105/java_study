package JavaStudyDate.day17.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listcompare {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(i);
            linked.add(i);
        }
        
        // 배열리스트에서 데이터 제어
        long s, e; // 시작시간 , 끝시간
        s = System.currentTimeMillis();
        int len = array.size();
        for (int i = 0; i < len ; i++) {
//            array.remove(0);
            array.get(i);   // 빠름
        }
        e = System.currentTimeMillis();
        System.out.printf("배열리스트 소모시간 : %d ms\n", e-s);

        // 배열리스트에서 데이터 제어
        s = System.currentTimeMillis();
        len = linked.size();
        for (int i = 0; i < len ; i++) {
//            linked.remove(0); // 빠름
            linked.get(i);
        }
        e = System.currentTimeMillis();
        System.out.printf("연결리스트 소모시간 : %d ms\n", e-s);

    }
}
