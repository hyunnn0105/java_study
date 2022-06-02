package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemderMenu {

    Scanner sc = new Scanner(System.in);
    MemberController mc = new MemberController();
    // **데이터의 주소를 저장하는 변수(포인터)

//    MemberMeun(){}
    public void mainMeun(){
        int count = mc.existMemberNum();
        System.out.printf("\n # 최대 등록 가능한 회원 수는 %d명입니다.\n", mc.SIZE);
        System.out.printf("현재 등록된 회원 수는 %s명입니다.\n", count);

        System.out.println("=================================================");

        while (true) {
            System.out.println("# 1. 새 회원 등록");
            System.out.println("# 2. 회원 검색");
            System.out.println("# 3. 회원 정보 수정");
            System.out.println("# 4. 회원 삭제");
            System.out.println("# 5. 모두 출력");
            System.out.println("# 9. 끝내기");

            System.out.println("\n# 메뉴 번호: ");
            int menu = sc.nextInt();


            switch (menu) {
                case 1:
                    // 회원가입 진행
                    insertMember();
                    break;
                case 2:
                    // 회원 검색
                    searchMember();
                    break;
                case 3:
                    // 정보 수정
                    updateMember();
                    break;
                case 4:
                    // 회원삭제
                    deletMember();
                    break;
                case 5:
                    // 전체 조회 출력
                    printAll();
                    break;
                case 9:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하세요!");

            }
        }
    }

    private void deletMember() {
        System.out.println("\n============ 회원 정보 검색 ==============");
        System.out.println(" # 1. 특정 회원 삭제하기");
        System.out.println(" # 2. 모든 회원 삭제하기");
        System.out.println(" # 9. 메인으로 돌아가기");

        int menu = inputNumber("-메뉴 입력 : ");
        switch (menu) {
            case 1:
                //id
                delete();
                break;
            case 2:
                //이름
                deleteAll();
                break;
            case 9:
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");


        }

    }

    private void delete() {
        String targetId = inputStr("\n# 삭제 대상 아이디:");

        if (mc.checkId(targetId)) {
            System.out.println("\n# 회원 정보가 삭제됩니다. [Y/N]");
            String answer = inputStr(">> ");

            switch (answer.toUpperCase().charAt(0)) {
                case 'Y': case 'ㅛ':
                    mc.delete(targetId);
                    System.out.printf("\n- [%s]회원님의 데이터가 삭제되었습니다.\n", targetId);
                    break;
                case 'N': case 'ㅜ':
                    System.out.println("\n- 삭제를 취소합니다.");
                    break;
            }

        }

    }

    private void deleteAll() {
        System.out.println("\n# 모든 정보가 삭제됩니다. [Y/N]");
        String answer = inputStr(">> ");

        switch (answer.toUpperCase().charAt(0)) {
            case 'Y': case 'ㅛ':
                mc.delete();
                System.out.println("\n- 모든 데이터가 삭제되었습니다.");
                break;
            case 'N': case 'ㅜ':
                System.out.println("\n- 삭제를 취소합니다.");
                break;
        }

    }

    private void updateMember() {
        System.out.println("\n============ 회원 정보 수정 ==============");
        System.out.println(" # 1. 비밀번호 수정하기");
        System.out.println(" # 2. 이름 수정하기");
        System.out.println(" # 3. 이메일 수정하기");
        System.out.println(" # 9. 메인으로 돌아가기");

        int menu = inputNumber("-메뉴 입력 : ");
        switch (menu) {
            case 1:
                //id
                updatePassword();
                break;
            case 2:
                //이름
                updateName();
                break;
            case 3:
                //이름
                updateEmail();
                break;
            case 9:
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");


        }

    }

    private void updateEmail() {
        String id = inputStr("- 아이디: ");
        String newEmail = inputStr("- 새로운 이메일: ");

        if (mc.updateEmail(id, newEmail)) {
            System.out.println("\n이메일 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }

    }

    private void updateName() {
        String id = inputStr("- 아이디: ");
        String newName = inputStr("- 새로운 이름: ");

        if (mc.updateName(id, newName)) {
            System.out.println("\n이름 수정 완료!");
        } else {
            System.out.println("\n수정 실패!");
        }

    }

    private void updatePassword() {
        String id = inputStr("- 아이디: ");
        //원래비밀번호
        String oldpw = mc.searchId(id).getPassword();
        String newpw = inputStr("- new password(" + oldpw + "): ");

        if (mc.updatePassword(id,newpw)) {
            System.out.println("비밀번호 수정완료");
        } else {
            System.out.println("비밀번호 수정실패");
        }

    }

    private void searchMember() {
        System.out.println("\n============ 회원 정보 검색 ==============");
        System.out.println(" # 1. 아이디로 검색하기");
        System.out.println(" # 2. 이름으로 검색하기");
        System.out.println(" # 9. 메인으로 돌아가기");

        int menu = inputNumber("-메뉴 입력 : ");
        switch (menu) {
            case 1:
                //id
                searchId();
                break;
            case 2:
                //이름
                searchName();
                break;
            case 9:
                return;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");

        }
    }

    // 2-1
    private void searchId() {
        String targetId = inputStr("- 조회할 아이디");
        Member member = mc.searchId(targetId);
        if (member != null) {
            System.out.println(member.inform());
        } else {
            System.out.println("-존재하지 않는 회원입니다");
        }
    }
    //2-2
    private void searchName() {
        String targetName = inputStr("- 조회할 이름: ");
        Member[] members = mc.searchName(targetName);
        if (members.length > 0) {
            System.out.println("\n=========== 검색된 회원 정보 ============");
            for (Member m : members) {
                System.out.println(m.inform());
            }
        } else {
            System.out.println("\n- 존재하는 회원이 아닙니다.");
        }

    }



    private void printAll() {

        Member[] members = mc.printAll();
        System.out.println("\n============ 전체회원정보 =============");
        for (Member m : members) {
            if (m == null) break;
            System.out.println(m.inform());
            // null error 주의!
        }
    }

    // 1번메뉴 처리 메서드
    private void insertMember() {
        System.out.println("\n# 새 회원을 등록합니다.");
        
        String id = null;
        while (true){
            id = inputStr("- 아이디 : ");
            if (!mc.checkId(id)) break;
            System.out.println("- 중복된 아이디 입니다.");
        }
        String name = inputStr("- 이름 : ");
        String password = inputStr("- 비밀번호 : ");
        String email = inputStr("- 이메일 : ");
        // 맨 앞글자 가져오기 + 대문자 변환
        char gender = inputStr("- 성별(m/f) : ").toUpperCase().charAt(0);
        int age = inputNumber("- 나이 : ");

        mc.insertMember(id, name, password, email, gender, age);

        System.out.println("\n 회원가입 성공");

    }

    // 입력처리를 간단하게 만드는 메서드
    private String inputStr(String msg) {
        System.out.printf(msg);
        return sc.next();
    }
    private int inputNumber(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }


}

