package JavaStudyDate.day2;

public class LogicalOperator {
    public static void main(String[] args) {

        boolean t = true, f = false;
        System.out.println( t & t );
        System.out.println( t & f );
        System.out.println( f & t );
        System.out.println( f & f );

        System.out.println( t | t );
        System.out.println( t | f );
        System.out.println( f | t );
        System.out.println( f | f );

        System.out.println("============================");

        //boolean r = 10 < 20; //ture
        /*
        int x = 10, y = 20;
        boolean result1 = (x != 10) & (++y == 21); //논리, f & t 연산
        boolean result2 = (x == 10) | (++y == 21);  //t | f 연산
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 22
         */

        int x = 10, y = 20;
        boolean result1 = (x != 10) && (++y == 21); //논리, f & t 연산
        boolean result2 = (x == 10) || (++y == 21);  //t | f 연산
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 20 -> 왜?
        // 단축 평가(&&, ||): 좌항에서 전체 논리연산의 결과가 판명날 경우 우항의 연산을 무시합니다.
        // y의 ++이 꼭 필요한 경우 하나만 사용하기

        // 논리 반전(!) - 단항연산자
        System.out.println(!t); //false

        System.out.println("he"+"llo"); // + 결합연산자
        // 정수 & 정수 ??? 먼소리야

        

    }
}
