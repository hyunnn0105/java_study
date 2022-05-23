package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nickName = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("- 삭제할 학생들의 별명을 입력하세요.");
        System.out.print("> ");
        String targetNickName = sc.nextLine();


        int index = -1;
        //입력받은 다음에 별명 배열에 있는지 확인
        while (true) {
            for (int i = 0; i < nickName.length; i++) {
                if (targetNickName.equals(nickName[i])){
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                // 삭제할 인덱스 골라내기? - 뒷 사람이 땡기기
                int delIndex = index;
                for (int i = delIndex; i < nickName.length-1; i++) {
                    nickName[i] = nickName[i+1];
                }
                System.out.println(Arrays.toString(nickName));


                 // 있으면 새로운 배열 만들기
                String[] saveArr = new String[nickName.length - 1];
                for (int i = 0; i < saveArr.length; i++) {
                    saveArr[i] = nickName[i+1];
                }

            } else {
                System.out.print( "해당별명( " +targetNickName +" )은 존재하지 않습니다.");
            }
        }



        //없으면 메세지 띄우고 다시 입력받기

        // 있으면 새로운 배열 만들기

        //옮기기

        // 삭제하기 + 메세지 띄우기

    }
}
