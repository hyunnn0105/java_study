package JavaStudyDate.day03;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직급을 입력하세요");
        System.out.println("[사원, 대리, 과장, 차장, 부장]");
        System.out.printf("> ");
        String level = sc.next();
        sc.close();
        
        switch (level) {
            case "사원" :
                System.out.println("사원의 급여는 200만원 입니다.");
                    break;
            case "대리" :
                System.out.println("대리의 급여는 300만원 입니다.");
                    break;
            case "과장" :
                System.out.println("과장의 급여는 400만원 입니다.");
                    break;
            case "차장" :
                System.out.println("차장의 급여는 500만원 입니다.");
                    break;
            case "부장" :
                System.out.println("부장의 급여는 600만원 입니다.");
                    break;
            default:
                System.out.println( level + "은(는) 없는 직급입니다.");
        }

    }
}
/*
    package JavaStudy.day03;

    import java.util.Scanner;

    public class SwitchQuiz {

        public static void day07object.PhoneFactory.main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("### 직급을 입력하세요. ###");
            System.out.println("[ 사원, 대리, 과장, 차장, 부장 ]");
            System.out.print(">> ");
            String position = sc.next();
            sc.close();

            int basic = 200;
            switch (position) {
                case "사원":
                    System.out.printf("%s의 급여는 %d만원입니다\n", position, basic);
                    break;
                case "대리":
                    System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 100);
                    break;
                case "과장":
                    System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 200);
                    break;
                case "차장":
                    System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 300);
                    break;
                case "부장":
                    System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 400);
                    break;
                default:
                    System.out.printf("%s(은)는 없는 직급입니다.\n", position);
            }
        }
    }
 */