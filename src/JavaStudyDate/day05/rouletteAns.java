package JavaStudyDate.day05;

public class rouletteAns {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
            // 선언부 밖으로 빼기
            int playerNum;
        while (true) {
            System.out.println("게임인원 2~4");
            playerNum = sc.nextInt();
            // 입력받고 인원수 검증, 문자도 처리? -> try & catch
            if (playerNum < 2 || playerNum > 4) {
                System.out.println("인원수X");
            } else {
                break;
            }
        }
        // 참여 인원수만큼 플레이어 이름입력받기
        System.out.println("\n 플레이어 이름을 등록합니다.");
        // 플레이어 이름 저장 배열
        String[] player = new String[playerNum];
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름: ", i + 1);
            players[i] = sc.nextLine();
        }
        // 참여 인원 이름 전체 출력
        System.out.println(Arrays.toString(players) + " 참가!");

        // 실탄 개수 입력받기
        System.out.printf("\n실탄 개수 (1 ~ 5개) ==> ");
        int bulletNum = sc.nextInt();
        sc.nextLine();

        // 실탄 장전하기
        boolean[] magazine = new boolean[6];

        // 입력된 실탄 수만큼 탄창배열의 내부값을 랜덤하게 true로 바꿔야함
        int success = 0; // 성공적으로 장전되었을 때의 카운트
        while (success < bulletNum) {
            int position = (int) (Math.random() * magazine.length);
            if (!magazine[position]) {
                magazine[position] = true;
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
        /*
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
         */


    }
}
