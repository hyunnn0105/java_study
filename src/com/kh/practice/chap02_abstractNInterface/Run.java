package com.kh.practice.chap02_abstractNInterface;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

    public static void main(String[] args) {
        PhoneController pc = new PhoneController();
        String[] method = pc.method();
        for (int i = 0; i < pc.method().length; i++) {
            System.out.println(method[i]);
        }

    }
}
