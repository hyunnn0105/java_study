package JavaStudyDate.day17.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" # 먹고싶은 음식을 입력하세요!");
        System.out.println(" # 입력을 중지하려면 <그만>이라고 입력하세요.");

        // 빈 배열 생성
        List<String> foodlist = new ArrayList<>();

        while (true) {
            System.out.print(">> ");
            String newData = sc.nextLine();

            if (newData.equals("그만")){
                break;
            } else {
                foodlist.add(newData);
            }
        }
        System.out.println("먹고싶은 음식리스트 : " + foodlist);
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
