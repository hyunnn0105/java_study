package stockjoin;

import stockjoin.member.Person;

// 호출하면 감소 - 회차 관리
public class Turn {
    private int Num = 0;

    public void end(){
        if(Num < 5) {
            Num++;
        } else {
            Num = 10000;
        }
    }


    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

}
