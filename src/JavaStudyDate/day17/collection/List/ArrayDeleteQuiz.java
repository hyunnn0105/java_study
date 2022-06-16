package JavaStudyDate.day17.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Array list로 바꾸기
public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 만들어서 list에 넣기도 가능
        /*
                String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
                List<String > tvxqList = new ArrayList<>(Arrays.asList(tvxq));

         */
        List<String> nickname = new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );

//        String[] nickName = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};



        int index = -1;
        //입력받은 다음에 별명 배열에 있는지 확인
        while (nickname.size()!=0) {
            // while문 종료조건 설정 안해서 sc.close(); 이거 안돌아감
            System.out.println("- 삭제할 학생들의 별명을 입력하세요.");
            System.out.print("> ");
            String targetNickName = sc.nextLine();

            boolean flag = nickname.contains(targetNickName);
            if (!flag) {
                // 없다
                index = -1;
            } else {
                // 있다
                index = nickname.indexOf(targetNickName);
            }

            if (index != -1) {
                System.out.println(nickname.get(index) + "의 별명을 삭제합니다.\n");
                // 삭제할 인덱스 골라내기? - 뒷 사람이 땡기기
                nickname.remove(index);
                System.out.println(nickname);

            } else {
                System.out.print( "해당별명( " + targetNickName +" )은 존재하지 않습니다.\n");
            }
            sc.close();
        }



        //없으면 메세지 띄우고 다시 입력받기

        // 있으면 새로운 배열 만들기

        //옮기기

        // 삭제하기 + 메세지 띄우기

    }
}
