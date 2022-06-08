package stockjoin;

import stockjoin.member.Person;

import java.util.Scanner;

public class StockMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person park = new Person();
        Turn turn = new Turn();

//        int count = 12;
        int count = 0;


            System.out.println(" 안녕하세요 Stock Join 에 오신걸 환영합니다.");
            System.out.printf(" 당신의 이름을 입력하세요 : ");
            String p = sc.next();
            park.setMyName(p);
            System.out.println("시작 금액을 선택하세요 ");
            System.out.println("#1. 100000.0원, #2.500000.0원, #3. 8000000000.0원");
            int money = sc.nextInt();

            switch (money) {
                case 1:
                    park.setCash(100000.0);
                    System.out.println("당신은 100000.0원을 선택하셨습니다");
                    break;
                case 2:
                    park.setCash(500000.0);
                    System.out.println("당신은 500000.0원을 선택하셨습니다");
                    break;
                case 3:
                    park.setCash(8000000000.0);
                    System.out.println("당신은 8000000000.0원을 선택하셨습니다");
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
                    return;
            }

            System.out.printf("당신의 이름은 %s \n시작 금액은 %2f 입니다\n",park.getMyName(), park.getCash());


        while (count < 5) {
            turn.end();
            System.out.printf("%s 턴이 시작됩니다.\n", turn.getNum());
//            System.out.println(turn.getNum());
            System.out.println("턴이 종료됩니다");

            count++;
        }
        System.out.println("진짜 끝");

    }

}
