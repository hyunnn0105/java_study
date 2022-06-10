package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Member;

public class Test {
    public static void main(String[] args) {
        Member mc = new Member("rksk", 12,'f');
        LibraryController lc = new LibraryController();
//        lc.searchBook("의");
        lc.selectAll();
        lc.rentBook(0);
    }
}
