package JavaStudyDate.day18.anonymus;

import Utility.Util;

public class Main {
    
    // 내부클래스
    public static class SubOperator implements Calculator{

        // 뺄셈기능
        @Override
        public int operate(int n1, int n2) {
            return n1-n2;
        }
    }
    public static void main(String[] args) {
        Calculator addCal = new AddOperator();
        System.out.println(addCal.operate(10,20));

        Calculator subcal = new SubOperator();
        System.out.println(subcal.operate(50,30));
        
        // 익명클래스 - 빨리
//        Calculator multiCal = new Calculator() class{}; - {}의 의미 : class 구현
        // class를 바로 만들어서 multiCal에 넣어줌 -> js 익명함수랑 유사
        Calculator multiCal = new Calculator(){
            @Override
            public int operate(int n1, int n2) {
                return n1*n2;
            }
        };
        System.out.println(multiCal.operate(5,3));

        // 람다
        Calculator divCal = (n1, n2) -> n1 / n2;
        System.out.println(divCal.operate(100,50));
        
        // 함수의 발전??? 과정
        // 1. 새로 클래스 파일 생성
        // 2. 클래스 안에 생성
        // 3. 실시간 오버라이딩
        // 4. 화살표함수같은거

        Util.line();
                                            // callback
        PowerfulOperator po = (f,s,cal) -> cal.operate(f,s);
                                                            // 오버라이딩
        System.out.println(po.powerOperate(300,500, new AddOperator()));
        System.out.println(po.powerOperate(700,500, new SubOperator()));

        // 바로 오버라이딩
        System.out.println(po.powerOperate(10, 30, new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1*n2;
            }
        }));

        System.out.println(po.powerOperate(1000,200,((n1, n2) -> n1/n2)));
    }
}
