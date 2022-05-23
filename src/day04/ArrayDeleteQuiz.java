package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nickName = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};



        int index = -1;
        //입력받은 다음에 별명 배열에 있는지 확인
        while (true) {
            // while문안에 입력받는걸 설정 안해서 안돌아감
            System.out.println("- 삭제할 학생들의 별명을 입력하세요.");
            System.out.print("> ");
            String targetNickName = sc.nextLine();
            
            for (int i = 0; i < nickName.length; i++) {
                if (targetNickName.equals(nickName[i])){
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println(nickName[index] + "의 별명을 삭제합니다.");
                // 삭제할 인덱스 골라내기? - 뒷 사람이 땡기기
                for (int i = index; i < nickName.length-1; i++) {
                    nickName[i] = nickName[i+1];
                }
                System.out.println(Arrays.toString(nickName));


                //있으면 새로운 배열 만들기
                String[] temp = new String[nickName.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = nickName[i];
                }
                nickName = temp;
                temp=null;
                System.out.println(Arrays.toString(nickName));
                sc.close();
                break;
            } else {
                System.out.print( "해당별명( " + targetNickName +" )은 존재하지 않습니다.");
            }
        }



        //없으면 메세지 띄우고 다시 입력받기

        // 있으면 새로운 배열 만들기

        //옮기기

        // 삭제하기 + 메세지 띄우기

    }
}
