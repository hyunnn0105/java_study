package stockjoin;

public class News {

    private String headLine;
    boolean good;


    public News(String headLine, boolean good) {
        this.headLine = headLine;
        this.good = good;

    }


    // 헤드라인만 보인다
    public String informNews() {
        return String.format("%s ", headLine);
    }

    // 주식 가격을 변동하는 메서드
//    public void changePrice() {
//        company.setPrice(company.getPrice() - 200);
//    }


    public String getHeadLine() {
        return headLine;
    }

    //ublic String inform() {
      //  return String.format("%s %s %s %s %c %d", id, name, password, email, gender, age);
    //}

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

//    public Stock getCompany() {
//        return company;
//    }
//
//    public void setCompany(Stock company) {
//        this.company = company;
//    }
}
