package day06;

// 자바의 메서드는 클래스 내부, 메서드 외부에서 선언가능
// 매서드 호출은 메서드, 생성자 내부(제귀함수)에서만 호출이 가능하다

public class cap01MethodBasic {
    // 1, ~x까지의 누적합을 구해 리턴하는 함수
    static int calTotal(int x) { //(함수가 리턴하는 모습)
        System.out.println("매서드 호출");
        int total = 0;
        for (int i = 0; i <= x; i++) {
            total += i;
        }
        return total;
    }

    //class 내부
    public static void main(String[] args) {
        int result = calTotal(10); // 함수는 int x 달라고함
        System.out.println("result = " + result);

        // return 값이 온다
        System.out.println(calTotal(100) == 5050);
        //method inner
    }

    // inner class
}
