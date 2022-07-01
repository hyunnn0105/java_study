package javateamproject.project_new.src.stockjoin;

import java.util.Scanner;

public class StockMenu {

    /*

    private Scanner sc = new Scanner(System.in);
    private Account ac = new Account();
    private Exchange ex = new Exchange();
    private Broadcast bd = new Broadcast();
    Person saram = new Person();



    public void StockMenu() {

        System.out.println("스탁 조인 게임에 참여해주셔서 감사합니다. ");
        System.out.println("당신의 이름을 입력해주세요 ");
        System.out.print(">>");
        String N = sc.nextLine();
        saram.setMyName(N);
        System.out.println("당신의 자산을 선택해주세요");
        System.out.println("1. 500만원 2. 1000만원  3. 3000만원  4. 게임 안하기 ");
        System.out.print(">>");
        int startMoney = sc.nextInt();

        switch (startMoney) {
            case 1:
                // 회원가입 진행
                saram.setCash(5000000);
                break;
            case 2:
                // 회원 검색
                saram.setCash(10000000);
                break;
            case 3:
                // 정보 수정
                saram.setCash(30000000);
                break;

            case 4:
                // 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                System.exit(0); // 프로세스 종료
                break;
            default:
                System.out.println("잘못 입력했습니다. 다시 입력하세요!");
                return;
        }

        System.out.printf("당신의 이름은 %s\n당신의 자본은 %.2f원입니다.\n", saram.getMyName(), saram.getCash());

        // 계좌에다 사람 값 넣어주기
        ac.setSaram(saram);



        int count =6 ;
        while (count > 0) {

            printExchange();

            printNews(count);

            System.out.println("======================================");

            System.out.println("# 1. 새 주식 사기 ");
            System.out.println("# 2. 가지고있는 주식 팔기 ");
            System.out.println("# 3. 내가 가지고있는 주식 보기 ");
            System.out.println("# 4. 현재 내 현금 보기 ");
            System.out.println("# 5. 턴 넘기기  ");
            System.out.println("# 9. 게임 끝내기 ");

            System.out.print("\n# 메뉴 번호: ");
            int menu = sc.nextInt();


            switch (menu) {
                case 1:
//                    새 주식 사기/

                   buyStock();
                    break;
                case 2:
//                    2. 가지고있는 주식 팔기
                    // sellStock();
                    break;
                case 3:
//                    내가 가지고있는 주식 보기
                 printMyStock();
                    break;
                case 4:
//                    현재 내 현금 보기
                    seeMyCash();
                    break;
                case 5:
//                  턴 넘기기
                    count = turnOver(count);
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

    private void seeMyCash() {

        System.out.printf("%s님의 현금은 \n%.2f원 입니다.\n",saram.getMyName(), saram.getCash());

    }

    private int turnOver(int count) {
        count--;
        System.out.printf(" 당신은 턴을 넘겼습니다. 현재 %d번째 턴입니다.",count);
        System.out.println("                                       ");
        return count;
    }


    private void printMyStock() {

        Stock[] acc =  ac.printAccount();
        for (Stock myStock : acc) {
            if (myStock == null) break;
            System.out.println(myStock.informStock());
        }

    }


    //주식 사기
    private void buyStock() {


        System.out.println("\n# 새 주식을 삽니다.");


        String stockName = inputStr(" 주식이름 ");
        double price = (double) inputNumber(" 가격 ");
        int pieces = inputNumber(" 갯수 ");

        // 입력받은 변수 계좌에 넣기
        ac.buyAccountStock(stockName,(double)price,pieces);

//        System.out.println("===============1=============");
//        ac.insertStock(stockName, (double) price, pieces);
//        System.out.println("===================2=========");
//        System.out.println("\n 주식 사기 성공 ");
//        System.out.println("==================3==========");
//       Stock[] acc =  ac.printAccount();
//        for (Stock myStock : acc) {
//            if (myStock == null) break;
//            System.out.println(myStock.informStock());
//        }
//        System.out.println("================4============");
    }

    //    현재 주식 가격을 나타내는 주식
    private void printExchange() {
        ExchangeStock[] exchange = ex.printExchange(); // 교환소 주식 배열 받는 함수

        System.out.println("===========현 재 주 식 가 격 ============");
        System.out.println("                                       ");
        //1번방법
        for (ExchangeStock ex : exchange) {
            if (ex == null) break;
            System.out.println(ex.informExstock());
        }
//        // 2번방법
//        for (int i = 0; i <exchange.length ; i++) {
//            System.out.println(exchange[i].informExstock());
//        }

    }


    private void printNews(int count) {


        News[] broad = bd.printNews();

//        System.out.printf("카운트 숫자는 : %d", count);
        System.out.printf("\n========== %d 번째 뉴스=============\n", 7 - count);
        System.out.println(broad[0].informNews());
        System.out.println("=======================================");

        // 맨 앞의 배열 삭제
        int delIdx = 0; // 삭제할 대상의 인덱스
        for (int i = delIdx; i < broad.length - 1; i++) {
            broad[i] = broad[i + 1];
        }


        News[] temp = new News[count];
        
        for (int i = 0; i < count; i++) {

            temp[i] = broad[i];
        }
        broad = temp;
        temp = null;


//        System.out.printf("broad.length 의 길이는 : %d", broad.length);
//        System.out.println("                                         ");


        // System.out.println(broad.length); 뉴스 갯수 줄어들음

//        for (News  m : broad) {
//            if (m == null) break;
//            System.out.println(m.informNews());
//        }

    }


    private String inputStr(String msg) {
        System.out.printf(msg);
        return sc.next();
    }

    // 입력처리를 간단하게 만드는 메서드
    private int inputNumber(String msg) {
        System.out.printf(msg);
        return sc.nextInt();
    }

     */


} // class end


















