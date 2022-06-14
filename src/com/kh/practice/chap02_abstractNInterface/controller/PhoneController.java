package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
    private String[] result = new String[2];

    // 설명이랑 다르게 구현함,,,ㅎ
    public String[] method(){
        SmartPhone GalaxyNote9 = new GalaxyNote9();
        SmartPhone V40 = new V40();
        SmartPhone[] smartPhones = {GalaxyNote9, V40};
        for (int i = 0; i < result.length; i++) {
            result[i] = smartPhones[i].printinformation();
        }

        return result;
    }

    /*
            Phone[] phones = {
                new GalaxyNote9(),
                new V40()
        };

        for (int i = 0; i < phones.length; i++) {
            // 스마트폰인지만 *확인*하고 저장
            if (phones[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) phones[i];
                result[i] = smartPhone.printInformation();
            }

     */
}
