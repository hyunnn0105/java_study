package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
    int[] lotto;
    public Lotto(){
        //초기화블럭 = 생성자
        lotto = new int[6];
        //로또번호 6개를 생성하여배열에 넣는 메소드
        makeLotto();
    }

    public void makeLotto(){
        for (int i = 0; i < lotto.length; i++) {
            // 1~45 범위의 랜덤정수
            int rn = (int) (Math.random()*45+1);

            if (!isDuplicate(rn)) { // 만약 중복이 아니라면
                lotto[i] = rn; // 중복 아니면 저장
            } else {
                i--; // 중복된 경우 빼기
            }
        }
    }
    public boolean isDuplicate(int rn) {
        for (int n : lotto) {
            if (rn == n) return true;
        }
        return false;
    }
    public void information() {
        System.out.println(Arrays.toString(lotto));
    }
}
