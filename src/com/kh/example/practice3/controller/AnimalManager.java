package com.kh.example.practice3.controller;

import com.kh.example.practice3.model.vo.Animal;
import com.kh.example.practice3.model.vo.Cat;
import com.kh.example.practice3.model.vo.Dog;

public class AnimalManager {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("1","dog1",11);
        animals[1] = new Dog("2","dog2",12);
        animals[2] = new Cat("3","cat1","home1","white1");
        animals[3] = new Cat("4","cat2","home2","white2");
        animals[4] = new Cat("5","cat3","home3","white3");

        for (Animal a : animals) {
            a.speak();
        }




    }
}
