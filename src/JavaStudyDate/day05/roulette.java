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
        for (int i = 0; i < gameMember; i++) {
            System.out.println((i+1) + "번째 player 이름을 입력하세요");
            String name = sc.next();
            playerName[i] = name;
        }

        System.out.println(Arrays.toString(playerName) + "참가 !\n");

        System.out.print("실탄 개수 (1 ~ 5개) ==> ");
        int bullet = sc.nextInt();
        sc.nextLine();

        boolean[] revolver = new boolean[6];


        System.out.println( bullet + "개의 실탄을 선택하셨습니다.");

        // 랜덤으로 숫자넣기
        int success = 0; // 성공적으로 장전되었을 때의 카운트
        while (success < bullet) {
            int position = (int) (Math.random() * revolver.length);
            if (!revolver[position]) {
                revolver[position] = true;
                success++;
            }
        }
        // == 핵심게임조작 ==
        // 선 턴 플레이어 랜덤으로 결정
        System.out.println("\n 줄 받았습니다, %s");
        /*
         한 턴동안 할일
        1. 무작위 탄창 회전
        탄창을 회전시켜 무작위로 격발구 위치 결정
        랜덤 인덱스 생성(0~5), 총알이 있는 위치(ture)가 결정되면 죽음
        2. 격발처리
         3-1. 사망처리
        4. 턴 조정
        5. 게임종료처리
        */
        // 격발위치 결정 - 랜덤

        int firstPos = (int) (Math.random()*magazine.length);
        System.out.printf("\n{%s님의 턴[] 탄창을 회전\n}");

        // 사망
        if (magazine[firstPos]) { //사망
            //사망자를 배열에서 제거 - 배열삭제알고리즘
            for (int i = 0; i < player.length-1; i++) {
                player[i] = player[i+1];
            }
            //하나작은배열
            String[] temp = new String[--playerNum];
            player = temp;
            // 격발된 총알처리
            magazine[firstPos] = false;
            //총알 갯수 줄여줌
            bulletNum--;

            //게임종료여부판단
            // 조건1.남은 p한묭
            if (playerNum==1){
                System.out.println("최후생존자이름 : 배열[0]"); // 앞으로 땡겨서 0
                break;
            } else if (bulletNum==0) {
                //총알이 전부 소진
                System.out.println("생존자");
                break;
            } else {
                // 게임 계속진행
                // 마지막 p가 죽은경우 0으로
                // 길이는 24번이 이미 줄였음?
            }

        } else { // 생존
            System.out.println("살았다");
            // 턴 조정 - 지금 턴이 마지막인지 확인
            // 힌명 죽었냐
            if (turn == player.length-1) {
                turn = 0;
            } else {
                turn++;
            }
        }



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
