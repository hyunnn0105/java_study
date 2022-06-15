package Homework.day0615.app;

import Homework.day0615.Productt;

// day0615 하위
public class AppMain {
    public static void main(String[] args) {
        Productt myProd = new Productt();
        myProd.setProduckId(1);
        myProd.setPrice(2000);
        myProd.setTitle("아이폰");
        myProd.setCreateDate("2020-08-15");
        System.out.println(myProd);
    }
}
