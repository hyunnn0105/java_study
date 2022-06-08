package stockjoin;

public class Exchange {
// 교환소
    private ExchangeStock[] eArr =  new ExchangeStock[6];



    public Exchange() {
        eArr[0] =new ExchangeStock("간편식품",5000,100000);
        eArr[1] =new ExchangeStock("무기",25000,100000);
        eArr[2] =new ExchangeStock("마스크",4000,100000);
        eArr[3] =new ExchangeStock("우주선",150000,100000);
        eArr[4] =new ExchangeStock("전기차",80000,100000);
        eArr[5] =new ExchangeStock("건설",62000,100000);
    }


    public ExchangeStock[] printExchange(){
        return eArr;
    }

    // 거래소에 존재하는 거래소 주식 갯수
    public int existMemberNum() {
        int count = 0; // 실제 저장된 회원의 수
        for (ExchangeStock ex : eArr) {
            if (ex == null) break;
            count++;
        }
        return count;
    }




}
