package day06;

import java.util.Arrays;

//paraneter(매개변수) : 함수가 외부에서 받아와야하는 값을 저장하는 공간
public class cap2MethodParam {
    // 2개의 정수를 전달받아 그 합을 돌려주는 함수
    // 이름->소괄호중괄호->받을 변수 타입 정하기
    static int add(int n1, int n2){
        System.out.println("함수호출");
        int sum = n1 + n2;
        return sum; // return 데이터타입 + static
    }

    //n개의 정수를 전달받아(배열) 총 합을 리턴하는 함수


    static int addAll(int...numbers) {
        // only 함수 'int...' <- 알아서 배열로 묶어줌
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total; //나가는애 신경쓰기
    }
    //2개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
    // 이럴때는 내가 묶어서 넘기는게 더 조음
    static int[] comparelength(int[] num1, int[] num2){
        return (num1.length > num2.length) ? num1 : num2;
    }
    //return 타입이 없을 시 void 사용
    static void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println("before call");
        System.out.println(add(10,20)+50); // 함수 먼저 > 다음에 계산
        System.out.println("after call");

        System.out.println("============================");
        short x = 12;
        // add(8,x); -> 자동 업케스팅 가능
        add(8,5);
        System.out.println(add(8,5));

        System.out.println("================================");
        int[] arr = {10,20,30}; //  시킬때는 여러개
        int sum = addAll(arr); // 올때는 택배박스 하나 배송옴
        System.out.println("sum = " + sum);

        // 배열한번에 넘기기
        int sum2 = addAll(new int[] {3,6,9,12}); // 처음 정의할떄는 new int
        System.out.println("sum2 = " + sum2);

        int sum3 = addAll(5,10,15,20,25,30); //알아서해줘서 굳
        // 단점) 배열 2개 사용 어려움
        System.out.println("sum3 = " + sum3);

        System.out.println("=================================");
        // 배열을 2개 이상으로 넣고싶다면 배열로 넘기기
        int[] sum4 = comparelength(new int[]{1,3,5,7}, new int[]{2,4,6,8});
        System.out.println(Arrays.toString(sum4));

        for (int i = 0; i < 5; i++) {
            hello();
        }
        
    }
}
