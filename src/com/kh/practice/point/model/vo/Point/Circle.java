package com.kh.practice.point.model.vo.Point;

public class Circle extends Point{
    private int radius;

    public Circle() {
    }
    public Circle(int x, int y, int radius) {
        // 1. setter 이용
//        this.setX(x);
//        this.setY(y);
//        this.radius = radius;
        // 2. 부모아용
        super(x,y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // radius 출력값 추가
    @Override
    public String toString(){
        return super.toString() + " radius: " + radius;
    }




}
