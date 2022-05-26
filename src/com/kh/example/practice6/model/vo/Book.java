package com.kh.example.practice6.model.vo;

public class Book {

    String title;
    String publisher;
    String author;
    int price;
    double discountRate;

    public Book(String t, String p, String a){
        System.out.println("책이름 : " + t + "출판사: " + p +"작가 : "+ a);
    };

    public Book() {
    }


    Book(String title, String publisher, String author, int price , double discountRate){

    };

    void inform(){
        System.out.println("제목 : " + title);
        System.out.println("출판사 : " + publisher);
        System.out.println("작가 : " + author);
        System.out.println("가격 : " + price);
        System.out.println("할인율 : " + discountRate);

    }
}
