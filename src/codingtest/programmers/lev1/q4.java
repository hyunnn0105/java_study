package codingtest.programmers.lev1;
// 모자란 수 구하기
public class q4 {

    public static long solution(int price, int money, int count) {
        //long answer = -1;
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += (price * i);
        }
        long restMoney = money - total;
        return (restMoney >= 0) ? 0 : -restMoney;
    }

//    public static long main(String[] args) {
//        System.out.println(solution(3,20,4));
//        // return 0;
//    }
}
