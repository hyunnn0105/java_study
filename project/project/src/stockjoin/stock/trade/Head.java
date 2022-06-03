package stockjoin.stock.trade;

public class Head {

    private Stock st = new Stock();
    private News[] news =  new News[];
    private int newsNum;

    // 뉴스배열이 랜덤출력
    public Head news(){
        news[1]=new News("증시폭락", false, new Stock("삼성전자"));

        return null;
    }
}
