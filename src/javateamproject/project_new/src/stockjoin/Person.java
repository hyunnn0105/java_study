package stockjoin;

public class Person {

    private String myName; // 내 이름
    private double cash; // 현재 가진돈

    // 생성자 ======================
    public Person() {
    }

    public Person(String myName, double cash) {
        this.myName = myName;
        this.cash = cash;
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
}
