package JavaStudyDate.day12.static_;

public class Calculator {
    public String Company; // 제조사
    public String color; // 색상
    public static double PI; // 원주율 - 여러곳에서 변동X

    // static initializer : 정적 초기화자
    // static 데이터의 초기화를 담당
    static {
        System.out.println("정적초기화 호출");
        PI = 3.14159;
    }

    public Calculator(String Company, String color){
        this.Company = Company;
        this.color = color;
        this.PI = 3.14159;
    }
    
    // 어디 계산기에 색상을 넣는건지 몰라서 스테틱 X
    public void painting (String color) {
        this.color = color;
    }
    
    // 원의넓이를 구하다 - 아무곳에서나 통일됨
    public static double calculateCircle(int r) {
        return PI*r*r;
    }

    public static void main(String[] args) {
//        Calculator.calculateCircle(5);

        System.out.println(" 원주율 : " + Calculator.PI);

        // 바로 답을 구할 수 있음
        Calculator sharp = new Calculator("삼성", "회색");
        sharp.painting("red");
    }
}
