package TeamprojectThird.Player;

public class Player {
    private String level;
    private String UserName;
    private int totalmoney;
    private double updownRate;
    private String CompanyName;
    private int BuyMoney;
    private int pieces; // 보유수량
    private int stocktotal;

    Player () {}

    public Player( String level,String userName, int totalmoney, double updownRate) {
        this.level = level;
        this.UserName = userName;
        this.totalmoney = totalmoney;
        this.updownRate = updownRate;
    }


    // 메서드 영역

    public String inform(){
        return String.format(" %s | %s | %d | %d",
                level, UserName, totalmoney, updownRate);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(int totalmoney) {
        this.totalmoney = totalmoney;
    }

    public double getUpdownRate() {
        return updownRate;
    }

    public void setUpdownRate(double updownRate) {
        this.updownRate = updownRate;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getBuyMoney() {
        return BuyMoney;
    }

    public void setBuyMoney(int buyMoney) {
        BuyMoney = buyMoney;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public int getStocktotal() {
        return stocktotal;
    }

    public void setStocktotal(int stocktotal) {
        this.stocktotal = stocktotal;
    }
}
