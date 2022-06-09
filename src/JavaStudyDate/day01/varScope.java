package JavaStudyDate.day01;

public class varScope {
    public static void main(String[] args) {
        //        ctrl + d - 아래로 복사
        //        ctrl + shift - 줄 이동
        //        모르면 alt + enter
        //        int num1 = 10;
        //        int num2 = 20; = > 아래랑 동일함 - 숫자상관XX
        int num1 = 10, num2 = 20;

        // 블록레벨스코프 - 특정 블록에서 선언된 변수는 해당블록을 넘어가면 메모리에서 자동삭제
        // 블록 밖에서 사용불가
        // 선언과 대입을 분할하기
        // int num3;

        /*
        if (ture) {
            // int num1 = 300; - 하위블럭에서 상위블럭과 이름이 동일한 함수생성불가
            int num3 = num1 + num2;
            System.out.println("num3 = " + num3);
        } //endif
        //System.out.println("num3 = " + num3); - 지역변수라서 사용불가
        int num4 = num1 + num2;
        int num3 = 300; // 생성가능

        */

        /*
            - camel case: phoneNumber (Java, JavaScript)
            상수?? NUMBER_A 이런거 사용할때 언더바 사용
        */
    }//end day07object.PhoneFactory.main
}// class
