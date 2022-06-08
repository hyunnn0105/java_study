package stockjoin;

public class ExchangeStock {



    private String EstockName; // 주식이름

    private double Eprice ; // 가격 ,
    private int Epieces ; // 갯수

//=================== 생성자 ==================
    public ExchangeStock(String estockName, double eprice, int epieces) {
        EstockName = estockName;
        Eprice = eprice;
        Epieces = epieces;
    }

    public ExchangeStock() {

    }

    //=======================메소드 ========================

// 거래소 정보 보여주는 메소드
    public String informExstock(){ //
        return String.format("%s | %.2f | %d", EstockName,Eprice,Epieces);
    }

    public String getEstockName() {
        return EstockName;
    }

    public void setEstockName(String estockName) {
        EstockName = estockName;
    }

    public double getEprice() {
        return Eprice;
    }

    public void setEprice(double eprice) {
        Eprice = eprice;
    }

    public int getEpieces() {
        return Epieces;
    }

    public void setEpieces(int epieces) {
        Epieces = epieces;
    }
}
