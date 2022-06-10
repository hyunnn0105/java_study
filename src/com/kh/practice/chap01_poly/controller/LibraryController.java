package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryController {
    private Member mem; // 회원정보
    private Book[] bList; // 모든 책 정보 저장
    
    // 필요한 상수 선언 - 헷갈리는 숫자 지정해서 변수대로 넣기
    public static final int RENT_FAIL = 1;
    public static final int RENT_SUCCESS = 0;
    public static final int RENT_SUCCESS_WITH_COUPON = 2;
    
    public LibraryController(){
        bList = new Book[5];
        bList[0] = new CookBook("백종원의 집밥","백종원","tvn",true);
        bList[1] = new AniBook("한번","미티","원모어",19);
        bList[2] = new AniBook("루피의","루피","원모어",12);
        bList[3] = new CookBook("이혜정의","이혜정","tvn",false);
        bList[4] = new CookBook("최현석의 집밥","최현석","tvn",true);
    }

    // 회원가입기능
    public void insertMember(Member mem){
        this.mem = mem;
    }

    // 회원정보 조회 = 회원주소 리턴
    public Member myInfo(){
        return this.mem;
    }

    // 도서 전체 리턴
    public Book[] selectAll(){
        for (int i = 0; i < bList.length; i++) {
            System.out.println( i+ "번 도서 : "+ bList[i].toString());
        }
        return this.bList;
    }

//    public Book[] searchBook(String keyword){
//        int count = 0;
//        // 검색결과에 따라 배열의 길이가 달라짐 - queue에 넣어서 쌓기
//        Book[] search = new Book[count];
//        for (int i = 0; i < bList.length; i++) {
//            if (bList[i].getTitle().contains(keyword)){
//                count++;
//                search[count] = bList[i];
//
//            } else {
//                System.out.println("없다");
//            }
//        }
//        return search;
//    }

    public Book[] searchBook(String keyword){
        // 검색결과에 따라 배열의 길이가 달라짐 - queue에 넣어서 쌓기

        // 검색된 책을 담을 큐 생성
        Queue<Book> bookQueue = new LinkedList<>();

        // 책 검색 시작
        for (Book book : bList) {
            if (book.getTitle().contains(keyword)){
                bookQueue.add(book);
            }
        }
        Book[] search = new Book[bookQueue.size()];
        for (int i = 0; i < search.length; i++) {
            search[i] = bookQueue.poll();
        }
        return search;
    }

    
    

    // 도서대여
    public int rentBook(int index){
        Book book = bList[index];
        // 책 정보 판단 instanceof
        if (book instanceof AniBook) {
            AniBook aniBook = (AniBook) book;
            // 나이검사 -> 다운캐스팅
            // 만화책을 대여할 수 있는경우
            if (aniBook.getAccessAge() <= mem.getAge()) {
                return RENT_SUCCESS;
            }
        } else if (book instanceof CookBook){
            CookBook cookBook = (CookBook) book;
            // 요리책인 경우
            if (cookBook.isCoupon()) {
                int Ccountplus = mem.getCouponCount()+1;
                return RENT_SUCCESS_WITH_COUPON;
            } else {
                return 0;
            }
        } else {
            return RENT_FAIL;
        }
        return index;
    }


}
