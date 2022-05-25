package day06;

import java.util.Arrays;

public class cap03methodReturn {

    static int add(int n1, int n2) {
        return n1+n2;
        // 종료후 호출한 값을 돌려줌
    }

    static void showAddresult(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
    }

    static void callName(String name) {
        if (name.length() > 5) {
            System.out.println("too long");
            return; // 함수탈출문 + 단독 리턴(only return 사용)
        }
        System.out.println("hi  "+name);
    }
    /*
        모든 함수의 리턴 값은 반드시 1개다.
        -> 데이터를 묶어서 하나로 리턴하기
        -> 배열 여러게 묶어서 리턴시 2차원 배열로 리턴등등,, 하나로만 리턴해라
        -5개의 애완동물 이름 목록에서 원하는 숫자를 전달하면
        그 숫자만큼 랜덤으로 애완동물 리스트를 뽑아서 리턴하는 함수

     */
    static String[] selectPet(int count) {
        // 매개변수 검증
        if (count < 1 || count > 5) {
            // 보이드가 아니면 null 리턴 ==
            return null;
        }

        String[] petList = {"멍멍이", "짹짹이", "꽥꽥이", "찍찎이", "꾸러기"};

        String[] selected = new String[count];
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random()*petList.length);
            selected[i] = petList[rn];
        }
        return selected;
        // 배열 주소 전해줌
    }



    // oh main함수는 return이 없다
    //(String... args) 이렇게도 작성 가능함
    public static void main(String[] args) {
        int r1 = add(10, 20);
        System.out.println(r1);

        int r2 = r1*3 + r1--;

        // 리턴이 없는 void 타입 함수는 변수에 저잘할 수 없다.
        //int r3 = showAddresult(3,8);

        // System.out.println(); - 예도 보이드

        int r4 =  add(add(10,20), add(5, 5));
        System.out.println("r4 = " + r4);
        //add(10,add(5,5)); - 1차 호출
        // add(30,10); -- 2차호출
        // add(40)

        callName("짝짝이");
        callName("하하하하하하");

        System.out.println("===============================");

        String[] selectPet = selectPet(3);
        System.out.println(Arrays.toString(selectPet));

    }

}
