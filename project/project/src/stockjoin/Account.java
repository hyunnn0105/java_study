package stockjoin;

import stockjoin.member.Person;
import stockjoin.stock.trade.Stock;

public class Account {
    private Stock[] ac =  new Stock[SIZE];

    private Person saram;
    public static final int SIZE = 10;

    public Account(Person saram) {
        this.saram = saram;
        ac[0] = new Stock("에너지 ETF",15.6, 15000 ,12);
        ac[1] = new Stock("비트코인 ETF",15.6, 15000,55);
        ac[2] = new Stock("메타버스 ETF",15.6, 15000,33);
        ac[3] = new Stock("전기차 ETF",15.6, 15000,16);
        ac[4] = new Stock("친환경 ETF",15.6, 15000,5);
    }


    // ========================매서드 ========================================================
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

    //주식을 배열 ac에 넣는(사는) 메서드
    public void buyStock(String stockName,double updownRate ,double price ,int pieces) {

        if(saram.getCash() < price*pieces) {
            System.out.printf("%s 주식을 사시려면 %f이 모자랍니다 ",stockName,(price*pieces)-(saram.getCash()));
            return;
        }

        int count = existStock();
        ac[count] = new Stock(stockName, updownRate , price ,pieces);
        System.out.printf("%s님은 %s주식을 %f어치 사셨습니다. \n남은 잔액은 %f원입니다"
                ,saram.getMyName() ,stockName,pieces*price, saram.getCash()-price*pieces );

        // 사람 돈에 세팅 ( 사람이 지금 가지고있는 돈 - 주식가격 * 주식수);
        saram.setCash(saram.getCash()-price*pieces);


    }


    //주식을 배열 ac에 빼는(파는) 메서드 매도 !!
    public void sellStock(String stockName , double price , int pieces){
        // 일단 내가 가지고있냐 없냐

        // 확인절차 1. 이름으로 확인하기
        int index = findIndexByStock(stockName);
        if (index == -1){
            System.out.printf("%s은 보유하고있는 주식이 아닙니다.",stockName);
            return;
        }

        Stock stock = ac[index]; // stockName 의 인덱스를 가진 주식

        // 확인절차 2. 가지고있는 갯수로 확인하기
        if (stock.getPieces() < pieces) {
            System.out.printf("팔수있는 %s주식의 보유수량이 모자랍니다.",stockName);
        }

        else if (stock.getPieces() >= pieces){ // 가지고있는 주식이  ~ 팔려는 주식보다 많을경우

            stock.setPieces(stock.getPieces() - pieces);// 가지고있는주식 / 초기화 / 가지고있는주식 - 팔고싶은 주식수
        }

        System.out.printf("%s님은 %s을 %f에 매도하셨습니다 " +
                        "\n 현재 남은 %s주식 수는 %d주 입니다",
                saram.getMyName(),stockName,price,stockName,stock.getPieces());

        // 배열 중간 삭제 메서드
//        1. 삭제하고싶은 배열의 인덱스를 구하고 ,
//                뒤에 인덱스를 앞에 인덱스로 덮어 씌운다
        for (int i = index; i < existStock() ; i++) {
            ac[i] = ac[i+1];
        }
        // 길이가 1 작은 새로 담을 배열
        Stock[] temp = new Stock[existStock()-1];

        // 새로담을 배열에 순서대로 다시 넣음
        for (int i = 0; i <existStock()-1 ; i++) {
            temp[i] = ac[i] ;
        }
//        순서대로 넣은 배열을 다시 원래 배열에 넣음
        ac = temp ;
        temp = null;


        // 있으면 파는데 .. 얼마만큼 팔아야되냐 .. ?
        // 팔긴 파는데 .. 16개중에 8개만 팔고싶으면 어떻게 하지 ..?

    }
    // 전체 주식 가격 구하기


}
