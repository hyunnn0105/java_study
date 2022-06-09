package JavaStudyDate.day06;

import java.util.Arrays;

public class MethodPractice {

    // 배열의 함수화?
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    // 배열의 마지막 위치에 데이터를 추가하는 함수
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length -1 ] = newFood;
        foods = temp;
    }
    // 배열 출력함수
    static void printFoods(){
        System.out.println(Arrays.toString(foods));
    }
    
    
    //인덱스 검사하고 출력하는 함수 ====================================================
    static int indexOf(String searchIdx){
        String target = searchIdx;
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                i++;
                index = i;
            }
        }
        return index>0 ? index-1 : index;
    }
    
    // pop 따로?
    // 삭제 remove ===========================================================================
    static String[] remove(String foodName) {
        // 존재확인
        if (indexOf(foodName) < 0){
            System.out.println("존재하지 않는 음식입니다");
            return null;
        }

        int target = indexOf(foodName);
        for (int i = target; i < foods.length-1; i++) {
            foods[i] = foods[i+1];
        }
        // pop
        String[] temp = new String[foods.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp; temp = null;
        return foods;
        // 삭제

    }

    // true or false =================================================================
    static boolean include(String foodNametf) {
        if (indexOf(foodNametf) >= 0){
            return true;
        } else {
            return false;
        }
        // != -1 이렇게도 간소화 가능
    }
    // 삽입 ===================================================================


    // 수정 ====================================================================
    static void modify(int targetnum, String targetName){
        foods[targetnum] = targetName;
    }
    //전체삭제 ==================================================================
    static void clear() {
        foods = new String[0];
    }



    // 함수 옮기는 함수????

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();
        
        int idx = indexOf("파스타");
        // idx에서 4 리턴
        System.out.println(idx);
        int idx2 = indexOf("김치찌개");
        System.out.println(idx2);
        // idx에서 -1 리턴
        int idx3 = indexOf("짜장면");
        System.out.println(idx3);

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        printFoods();
        String[] nomango = remove("망고"); // 존재하지 않는 음식명입니다 출력.

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        System.out.println(flag);
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
        System.out.println(flag2);

//        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
//        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
//        clear();  // foods배열 모든 데이터 삭제
    }
}
