package day2;

public class RandomExample {
    public static void main(String[] args) {
        // === 랜덤정수 ===
        // 난수생성
        // 0.0 <= ~ < 1.0미만 랜덤한 수
        double rn = Math.random();
        // System.out.println("rn = " + rn);

        //1<= rn <10 1이상 10이하 랜덤정수
        /*
            Math.random()               -> 0.0 <= ~ < 1.0
            Math.random()               -> 0.0 <= ~ < 1.0
            int로 형변환 하면서 소숫점 다 날라감
            (int) (Math.random()*10)    -> 0 <= ~ < 10
            (int) (Math.random()*10)+1  -> 0 <= ~ < 11

         */
        // 대입=5 단항()2  참조.1    이항*3 이항+3
        int num = (int) (Math.random()*10)+1;
        System.out.println("num = " + num);
        // 괄호 제거하면 답이 1만 나옴 왜?


    }
}
