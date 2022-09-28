package JavaStudyDate.day05;

import java.util.Arrays;
import java.util.Scanner;

public class roulette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gameMember = 0;
        while (true) {
            // 게임인원 등록 - 입력
            System.out.println("게임 인원을 2~4 사이로 등록하세요");
            gameMember = sc.nextInt();
            if (gameMember < 2 || gameMember > 4) {
                System.out.println("인원수를 다시 입력해주세요");

            } else {
                System.out.println(gameMember + "인원수를 입력했습니다.");
                break;
            }
        }

            // 플레이어 이름등록
            String[] playerName = new String[gameMember];
            for (int i = 1; i < playerName.length + 1; i++) {
                System.out.println(i + "번째 player 이름을 입력하세요");
                String name = sc.next();
                playerName[i] = name;
            }

        System.out.println(Arrays.toString(playerName) + "참가 !");




    /*
        // 실탄의 개수 추가
        int bullet = 1;

        // 배열은 6개탄창 ======== 배열을 랜덤으로 바꾸기??
        int[] bbang = {1, 1, 1, 1, 1, -1};

        // 총 돌리기(무작위 실행)
        int random = (int) ((Math.random()*5)-1);
        String firStart = playerName[random];
        System.out.println(firStart+"부터 시작합니다.");
        // 시작점 인덱스 찾기


        // 여기서부터 순서대로

        for (int i = 1; i < bbang.length ; i++) {
            System.out.println(firStart+"님의 턴");
            System.out.println(">> ");

            // enter 시 빵야
            int index = 1;
            // 총알있 t / 총알없 f
            // 랜덤으로 배열 위치 바꾸기??
            for (int j = 0; j < bbang.length; j++) {
                if (bbang[j] == 1){
                    // System.out.println("hello");
                } else {
                    System.out.println("by");
                }
            }
            // 살았는지/죽었는지 => 리볼버 배열에 따라 다름?
        }


    }

     */

    }
}
