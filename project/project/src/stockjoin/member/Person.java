package stockjoin.member;

import stockjoin.Account;

public class Person {
    private String myName;
    private double cash;

    private Account stockAccount;

    // 기본생성자
    public Person() {
    }

    public Person(String myName, double cash, Account stockAccount) {
        this.myName = myName;
        this.cash = cash;
        this.stockAccount = stockAccount;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public Account getStockAccount() {
        return stockAccount;
    }

    public void setStockAccount(Account stockAccount) {
        this.stockAccount = stockAccount;
    }

}
