package day04;

public class ArraySearch {
    public static void main(String[] args) {
        //배열탐색 알고리즘 : 인덱스 찾기, 유무 확인

        // 순차탐색
        // 배열만들기
        String[] foods = {"치킨", "피자", "삼겹살", "파스타"};
        String target = "치킨"; //유무및 인덱스 위치확인
        
        int index = -1; // 찾은인덱스 저장할변수 - 유무확인에서 사용
        // index에서 ++ 해주면서 비교해줌
        for (int i = 0; i < foods.length ; i++) {
            // 찾은 인덱스와 비교 반복적
            if(target.equals(foods[i])) {
                index = i;
                break;
            }
        } //end for
        System.out.println("찾은 인덱스 : " + index);

        //유무확인
        boolean hasFood = index != -1; //! + =
        System.out.println("존재유무 : " + hasFood);

        // 수정을 하려면 인덱스 알아야함 -> 탐색
        foods[2] = "보쌈";
    }
}
