package com.kh.example.practice1.model.vo;

import javax.lang.model.element.Name;

public class Member {
    String memberId;
    String memberPwd;
    String memberName;
    int age;
    char gender;
    String phone;
    String email;

    public Member(){}

    public void changeName(String name){
        memberName = name;
    }
    public void printName(){

    }
}

