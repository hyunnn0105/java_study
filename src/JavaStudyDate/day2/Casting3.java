package JavaStudyDate.day2;

public class Casting3 {
    public static void main(String[] args) {

        //type이 다른 데이터의 연산
        int a = 10;
        short b = 30;
//         c = a + b; c의 type은?
        int c = a + b;
        
        // 타입이 다른 데이터의 연산에서는 작은쪽을 큰쪽으로 변환 후 연산을 진행
        // 원래는 불가능 -> 한쪽으로 맞추기 => (int) b;
        // 업캐스팅이 더 안전함 -> 자동으로 업캐스팅실행



        // 단일문자 + 숫자
        char d = 'A';   //2b - 아스키코드값 65
        int e = 100;    //4b
        System.out.println( d + e); //165

        // ** 문자열 + 숫자 = 문자열


        // ** 단일문자 + 숫자 = 숫자
        char dd = 'A';   //아스키코드값 65
        int ee = 2;    //4b
        System.out.println( dd + ee); //67

        //아스키코드 C값 구하기 want
        char f = (char) (dd + ee);
        System.out.println("f = " + f); // f = C

        // =========================
        System.out.println(3.0 + 5); // 8.0


        /*
            int보다 작은 데이터 (byte, short, char) 끼리의 연산은 결과가 자동으로 int로 변환되어 처리
            -> 데이터 오버플로우, 언더플로우 방지 (안전장치)
        */

        byte b1 = 100;
        byte b2 = 20;

        // byte result = b1 + b2;
        int result = b1 + b2;

        System.out.println('A' + 'B'); //131 - char''(인트보다 작은 데이터 끼리의 연산)
                                    // -> int로 변환되어 계산됨
        System.out.println("A" + "B"); //AB - String""(문자열)
        
        // 단항연산이 이항연산보다 빠름

        /*
            x = 3
            y = ++3 + 5*3
            y = 4 + 15
            x=4, y=19
            z = (5*19--) + (X++) - (--Y)
            z = (5*19) + 4 - 18
            z = 105 + 4 -18
            z = 85
         */

        int x = 3;
        int y = ++x + 5 * 3;
        int z = 5*y-- + x++ - --y;
        System.out.println("x = " + x); // 5
        System.out.println("y = " + y); // 17
        System.out.println("z = " + z); // 82




    }

}
