package stockjoin.stock.trade;

// 주식에 대한 정보
public class Stock {
    // 기업
    // 기업 이름,가격 지정

    private String stockName; // 주식이름
    private double updownRate; // 등락률
    private double price ; // 가격 ,
    private int pieces ; // 갯수

    private double purchase;// 갯수 * 가격

    Stock() {
    }

    public Stock(String stockName) {
        this.stockName = stockName;
    }

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
//        this.pieces = pieces;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getUpdownRate() {
        return updownRate;
    }

    public void setUpdownRate(double updownRate) {
        this.updownRate = updownRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }
}
