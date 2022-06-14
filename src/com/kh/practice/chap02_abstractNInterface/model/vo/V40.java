package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
    public V40() {
        setMaker("엘지");
    }

    @Override
    public String picture() {
        return "1200,1600만 화소 트리플 카메라";
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선충전";
    }

    @Override
    public boolean bluetoothPen() {
        return false;
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름";
    }

    @Override
    public String touch() {
        return "정전식";
    }

    @Override
    public String printinformation() {
        return String.format("V40은 %s\n %s\n %s\n %s\n %s\n %s\n " +
                        "블루투스 펜 탑재 여부 : %s\n"
                , super.printinformation(), makeCall() ,takeCall()
                ,picture(), charge(), touch(), bluetoothPen());
    }
}
