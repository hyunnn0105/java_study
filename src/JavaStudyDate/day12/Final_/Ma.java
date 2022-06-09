package JavaStudyDate.day12.Final_;

public class Ma {
    public static void main(String[] args) {
        Korean park = new Korean("박철수", "991111-1122334");
        Korean kim = new Korean("김영희", "881111-1122334");
        Korean kim1 = new Korean("김영희2", "881111-1122334");
        Korean kim2 = new Korean("김영희3", "881111-1122334");

        park.name = "박찬호";
        // 주민번호 절대 변경불가
//        kim.id = "1234";
        // 불변성O
//        kim.nation = "USA";

        System.out.println(park);
        System.out.println(kim);
        System.out.println(kim1);
        System.out.println(kim2);
    }
}
