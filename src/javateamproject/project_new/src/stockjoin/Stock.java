package stockjoin;

public class Stock {

    private String stockName; // 주식이름

    private double price ; // 가격 ,
    private int pieces ; // 갯수


    // 생성자
    public Stock() {

    }

    public Stock(String stockName, double price, int pieces) {
        this.stockName = stockName;
        this.price = price;
        this.pieces = pieces;
    }

    public String informStock(){
        return String.format("%s %.1f %d",stockName, price, pieces );
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
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
}
