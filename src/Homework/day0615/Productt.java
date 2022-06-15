package Homework.day0615;

public class Productt {

    private long produckId; // 대박을 예상하고,,,
    private String title;
    private int price;
    private String createDate;


    public Productt() {
    }

    public Productt(long produckId, String title, int price, String createDate) {
        this.produckId = produckId;
        this.title = title;
        this.price = price;
        this.createDate = createDate;
    }

    public long getProduckId() {
        return produckId;
    }

    public void setProduckId(long produckId) {
        this.produckId = produckId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "productt{" +
                "produckId=" + produckId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
