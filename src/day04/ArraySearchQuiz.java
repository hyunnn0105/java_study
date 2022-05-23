package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보 : " + Arrays.toString(member));


        // 인덱스 찾기
        // 찾은거 아래로 가져와서 수정하기

        int index = -1;
        while (true) {

            System.out.println("- 수정할 맴버의 이름을 입력하세요");
            System.out.print(">> ");
            String target = sc.nextLine();

            for (int i = 0; i < member.length; i++) {
                if (target.equals(member[i])) {
                    index = i;
                    //System.out.println("찾은 인덱스 : " + index);
                    break;
                }
            }
            /*
            if (index != -1) {

                //이름변경
                System.out.println(member[index] + "의 이름을 변경합니다.");
                System.out.printf(">> ");
                String change = sc.nextLine();
                member[index] = change;
                System.out.println("변경완료!");
                System.out.println("변경 후 정보 : " + Arrays.toString(member));
                break;

            } else {
                boolean notMember = index != -1; // (t/f) - -1이 아닌가요? 아니요 -1입니다?
                System.out.println(target + "는 없는 이름입니다.");
                continue; // 이거 오ㅐ 안됨
            }
            */

            //수정 여부 판단
            if (index != -1) {
                System.out.printf("%s의 별명을 변경합니다.\n", target);
                System.out.printf(">> ");
                String newName = sc.next();
                member[index] = newName;
                System.out.println("변경 완료!!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(member));
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", target);
            }
        }
        sc.close();

    }
}
//                else {
//                    System.out.println(target + "없는이름입니다.");
//                    System.out.println("- 수정할 맴버의 이름을 입력하세요");
//                }