package JavaStudyDate.day2;

public class StdOutput {
    public static void main(String[] args) {
        // 표준출력
        String dog = "멍멍이", cat = "야옹이";

        System.out.print(dog);
        System.out.print(cat);
        //println 안에는 \b기능이 들어가있어서 강제 줄 변경

        int month = 7;
        int day = 17;
        String anniversary = "제헌절";

        System.out.println(month + "월" + day + "일은" + anniversary +"입니다.");

        // === **포멧문자형식 ===
        //  10진수 정수 %d, %f : 실수, %s: 문자열, %c : 단일문자
        // '\n' 뒤에 넣어서 한 줄 띄우기
        System.out.printf("%d월은 %d일은 %s 입니다.\n", month, day, anniversary);
        System.out.println(dog);

        //=== 실수포멧팅 ===
        // %f: 강제로 소숫점 6자리를 표현한다.
        // %.4f - 소숫점 4자리 수까지
        // %% 두번 작성시 특수기호로 인식해줌
        double rate = 25.4567;
        System.out.printf("비율은 %.4f입니다.\n", rate);
        System.out.printf("비율은 %.2f입니다.\n", rate);
        System.out.printf("비율은 %.2f%%입니다.\n", rate);



    }
}
