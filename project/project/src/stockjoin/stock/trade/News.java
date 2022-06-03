package stockjoin.stock.trade;

public class News {
    private String title;
    private boolean good;
    private  Stock stock;

    public News(String title, boolean good, Stock stock) {
        this.title = title;
        this.good = good;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
