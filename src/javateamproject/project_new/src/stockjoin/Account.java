package stockjoin;


public class Account {
    // 내 계좌 , 내가 가진 주식  배열
    // 계좌

    private Stock[] arr = new Stock[SIZE];
    private Person saram;
    public static final int SIZE = 6;

    private Exchange st;
    private ExchangeStock[] eArr;



    public Account() {


    }

    /**
     * 실제로 배열에 저장되어 있는 회원객체의 숫자를 세는 메서드
     *
     * @return count - 실제 저장된 회원의 수
     */

    // 보유 주식 리턴
    public Stock[] printAccount() {
        return arr;
    }
        



    public int existStock() {
        int count = 0; // 실제 저장된 회원의 수
        for (Stock m : arr) {
            if (m == null) break;
            count++;
        }
        return count;
    }

    /**
     * 아이디를 통해 회원배열에서 특정 회원이 저장된 인덱스를 알려주는 기능
     *
     * @param stockName - 찾을 회원의 아이디값
     * @return 찾은 회원의 인덱스값, 못찾을 시 -1 리턴
     */


    // 내 계좌에서 찾기
    public int findIndexById(String stockName) {
        int index = -1;
        for (int i = 0; i < existStock(); i++) {
            if (stockName.equals(arr[i].getStockName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean checkId(String inputId) {
        return findIndexById(inputId) != -1;
    }

    public void insertStock(String stockName, double price, int pieces) {
        int count = existStock();
        arr[count] = new Stock(stockName, price, pieces);
    }


// 교환소에서 살때

    public int findIndexByIdE(String EstockName) {
        int index = -1;
        for (int i = 0; i < existStock(); i++) {
            if (EstockName.equals(eArr[i].getEstockName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    //주식을 배열 ac에 넣는(사는) 메서드
    public void buyAccountStock(String EstockName, double price, int pieces) {

        if (saram.getCash() < price * pieces) {
            System.out.printf("%s 주식을 사시려면 %.2f이 모자랍니다 \n", EstockName, (price * pieces) - (saram.getCash()));
            return;
        }

        int count = existStock();
        arr[count] = new Stock(EstockName, price, pieces);
        System.out.printf("%s님은 %s주식을 %.2f어치 사셨습니다. \n남은 잔액은 %.2f원입니다\n"
                , saram.getMyName(), EstockName, pieces * price, saram.getCash() - price * pieces);

        // 사람 돈에 세팅 ( 사람이 지금 가지고있는 돈 - 주식가격 * 주식수);
        saram.setCash(saram.getCash() - price * pieces);


    }


    //주식을 배열 ac에 빼는(파는) 메서드 매도 !!
    public void sellStock(String stockName, double price, int pieces) {
        // 일단 내가 가지고있냐 없냐

        // 확인절차 1. 이름으로 확인하기
        int index = findIndexById(stockName);
        if (index == -1) {
            System.out.printf("%s은 보유하고있는 주식이 아닙니다.", stockName);
            return;
        }

        Stock stock = arr[index]; // stockName 의 인덱스를 가진 주식

        // 확인절차 2. 가지고있는 갯수로 확인하기
        if (stock.getPieces() < pieces) {
            System.out.printf("팔수있는 %s주식의 보유수량이 모자랍니다.", stockName);
        } else if (stock.getPieces() >= pieces) { // 가지고있는 주식이  ~ 팔려는 주식보다 많을경우

            stock.setPieces(stock.getPieces() - pieces);// 가지고있는주식 / 초기화 / 가지고있는주식 - 팔고싶은 주식수
        }

        System.out.printf("%s님은 %s을 %f에 매도하셨습니다 " +
                        "\n 현재 남은 %s주식 수는 %d주 입니다",
                saram.getMyName(), stockName, price, stockName, stock.getPieces());

        // 배열 중간 삭제 메서드
//        1. 삭제하고싶은 배열의 인덱스를 구하고 ,
//                뒤에 인덱스를 앞에 인덱스로 덮어 씌운다
        for (int i = index; i < existStock(); i++) {
            arr[i] = arr[i + 1];
        }
        // 길이가 1 작은 새로 담을 배열
        Stock[] temp = new Stock[existStock() - 1];

        // 새로담을 배열에 순서대로 다시 넣음
        for (int i = 0; i < existStock() - 1; i++) {
            temp[i] = arr[i];
        }
//        순서대로 넣은 배열을 다시 원래 배열에 넣음
        arr = temp;
        temp = null;


        // 있으면 파는데 .. 얼마만큼 팔아야되냐 .. ?
        // 팔긴 파는데 .. 16개중에 8개만 팔고싶으면 어떻게 하지 ..?


    }


    public Stock[] getArr() {
        return arr;
    }

    public void setArr(Stock[] arr) {
        this.arr = arr;
    }

    public Person getSaram() {
        return saram;
    }

    public void setSaram(Person saram) {
        this.saram = saram;
    }

    public Exchange getSt() {
        return st;
    }

    public void setSt(Exchange st) {
        this.st = st;
    }

    public ExchangeStock[] geteArr() {
        return eArr;
    }

    public void seteArr(ExchangeStock[] eArr) {
        this.eArr = eArr;
    }
}
