package TeamprojectThird;

public class Account {

    private Stock[] ac = new Stock[SIZE];
    
    public static final int SIZE = 10;

    public Account() {
        ac[0] = new Stock("에너지 ETF", 15.6, 15000, 12, 12);
        ac[1] = new Stock("비트코인 ETF", 15.6, 15000, 55,90);
        ac[2] = new Stock("메타버스 ETF", 15.6, 15000, 33,50);
        ac[3] = new Stock("전기차 ETF", 15.6, 15000, 16,50);
        ac[4] = new Stock("친환경 ETF", 15.6, 15000, 5,50);
    }

    public int existStock() {
        int count = 0; // 실제 가지고있는 주식 갯수
        for (Stock ac : ac) {
            if (ac == null) break;
            count++;
        }
        return count;
    }

    // 보유 주식 리턴
    public Stock[] printAll() {
        return ac;
    }


    // 주식이름으로 주식 인덱스 찾기
    public int findIndexByStock(String stockName) {
        int index = -1;
        for (int i = 0; i < existStock(); i++) {
            if (stockName.equals(ac[i].getStockName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 가격 변경하기

    // 전체 주식 가격 구하기
//    public double totalstockpriceNum (double price ,double pieces){
//        double totalprice =
//        return totalprice;
//        // AC.getprice
//    }
    

    // game 시행 횟수 구하기
    /*
    int total = 0;
    while(total < 5) {
        // total 위치는 turn 변경 시점 == 등락폭 5번 보기
        total++;
    }

     */
}
