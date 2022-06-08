package JavaStudyDate.day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" # 먹고싶은 음식을 입력하세요!");
        System.out.println(" # 입력을 중지하려면 <그만>이라고 입력하세요.");

        // 빈 배열 생성

        //String[] foodList = {};
        String[] foodList = new String[0];
        //String[] foodListAn = new String[foodList.length];

        while (true) {
            System.out.print(">> ");
            String newData = sc.nextLine();

            if (newData.equals("그만")) break;

            //배열크기증가 - 기존배열 + 1
            String[] temp = new String[foodList.length + 1];
            // String[] temp = new String[foodList.length+1];
            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }
            temp[temp.length-1] = newData;
            foodList = temp;
        }
        System.out.println("먹고싶은 음식리스트 : " + Arrays.toString(foodList));
        sc.close();
        /*
        for (int i = 0; i < foodListAn.length; i++) {


            // 입력중지-그만(if)
            if (newData.equals("그만")) {} break;

            // 배열의 크기를 1증가시킨다
            // 기존의 음식데이터를 증가한 새 배열에 복사한다.
            // 새로운 음식명을 마지막 위치에 추가한다.
            foodListAn[i] = foodList[i];

            System.out.println(Arrays.toString(foodListAn));

        }
        */

    }
}
