package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Test {
    public static void main(String[] args) {
        MemberController mc = new MemberController();
//        System.out.println(mc.existMemberNum());
//
//        int index = mc.findIndexById("abc");
//        System.out.println("inx:  " + index);
//
//        System.out.println(mc.checkId("abccc"));
        //mc.insertMember("zzz", "김철수", "11", "oo", 'M', 33);

//        Member member = mc.searchId("abc");
//        System.out.println(member.inform());

        // 배열 안 반복해서 출력
//        Member[] members = mc.searchName("김철수");
//        for (Member m : members) {
//            System.out.println(m.inform());
//        }

//        boolean member = mc.updatePassword("abc", "123456");
//        System.out.println(member);

        boolean member = mc.delete("kkk");
        System.out.println(member);

    }
}
