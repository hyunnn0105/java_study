package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
    private String maker;

    public SmartPhone() {
    }

    public String printinformation(){
        return String.format("%s에서 만들어졌고 제원은 다음과 같다", maker );
    };

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
