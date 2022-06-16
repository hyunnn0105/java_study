package JavaStudyDate.day17.collection.map;

import Utility.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student{
    String name; // 이름
    int grade; //학년


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

}

public class MapExample {
    public static void main(String[] args) {

//        Map map = new HashMap<>();
        // key - string / value - student
        Map<String ,Student> map = new HashMap<>();

        // put data 추가(k,v)
        map.put("짹짹쓰", new Student("둘리",4));
        map.put("짹짹쓰", new Student("둘리1",4));
        map.put("멍멍이", new Student("둘3",6));
        map.put("후후후", new Student("둘4",12));

        System.out.println(map.size());
        System.out.println(map);
        
        // get(key) : 저장된 value 참조
        Student student = map.get("멍멍이");
        System.out.println("student = " + student);

        Util.line();

        // contianskey(key) : map에 key가 있는지 유무 확인

        System.out.println(map.containsKey("멍멍이"));
        System.out.println(map.containsKey("히히히"));
        
        // map 루프처리 for(x : map) -> map이 안들어감
        Set<String> keyset = map.keySet(); // map의 모든 키를 set에 담아 리턴
        System.out.println(keyset);

        // key 들을 set으로 받은 다음 그 set을 반복

        for (String key : keyset) {
            System.out.println(map.get(key));
        }
        
        //remove(key) : key에 해당하는 Entry 삭제
        map.remove("멍멍이");
        System.out.println(map);

//        map.clear();
//        System.out.println(map.isEmpty());

        // 맵에 value값으로 list를 사용하려면
        Map<String, List<Integer>> mapList = new HashMap<>();

    }
}
