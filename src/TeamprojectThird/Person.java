package TeamprojectThird;


public class Person {

    private String name;
    private int totalprice;

    Person(){}

    Person (String name) {
        this.name = name;
        this.totalprice = 100000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }
}


