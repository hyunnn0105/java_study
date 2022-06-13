package com.kh.example.practice3.model.vo;

import datastructure.chap5.stack.Stack;

public class Dog extends Animal{
    private int weight;
    public static final String PLACE;

    static {
        PLACE = "애견카페";
    }

    public Dog() {
    }

    public Dog(int weight) {
        this.weight = weight;
    }

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speak(){
        System.out.printf(" %s 몸무게는 %dkg입니다\n" ,super.toString(), weight);
    }



}
