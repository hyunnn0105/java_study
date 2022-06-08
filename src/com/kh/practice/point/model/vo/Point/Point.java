package com.kh.practice.point.model.vo.Point;

public class Point extends Object{
    private int x;
    private int y;

    public Point() {    // no args

    }
    public Point(int x, int y) { // all args
        this.x = x;
        this.y = y;
    }

    // tostring overding해서 주소값을 대신 필드값을 넣어줌
//    @Override
//    public String toString1(){
//        return String.format("x: %d, y: %d", x, y);
//    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
