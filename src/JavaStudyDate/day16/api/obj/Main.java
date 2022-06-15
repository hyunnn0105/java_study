package JavaStudyDate.day16.api.obj;

import Utility.Util;

public class Main {
    // ㅇㅖ외를 소환한 곳에서도 떠넘기는건가???
    public static void main(String[] args) throws CloneNotSupportedException {
        Pen p1 = new Pen(new Company("모나미", "서울"),01,"dlfqjs",1000);
        Pen p2 = new Pen(new Company("하이","부산"),02,"이번",2000);
//        Pen p3 = new Pen(03,"삼번",3000);

//        Pen p4 = p2 //주소복사
        Pen p4 = (Pen) p2.deepClone();
        p2.color = "노랑";
        p2.company.address = "서울";
        System.out.println("p2 = " + p2);
        System.out.println("p4 = " + p4);

//        System.out.println(p1.equslas(p3));

        Util.line();

        Count c = null;
        for (int i = 0; i < 20; i++) {
            c = new Count(i + 1);
            c = null;
            System.gc(); // 가비지 컬랙터 좀 더 빨리 가동
            // 삭제 순서 정해진거 X
        }
    }
}
