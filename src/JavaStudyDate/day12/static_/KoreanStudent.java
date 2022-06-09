package JavaStudyDate.day12.static_;

public class KoreanStudent {
    String major;
    
    // 한국인 학생은 한국사람
    static String contury;
    
    void askMajor(){
        System.out.println(major);
        System.out.println(contury);
    }
    // 누구에게 물어봐도 동일한 대답
    static void askContury(){
        System.out.println(contury);
//        System.out.println(major);
    }

    public static void main(String[] args) {
        KoreanStudent.askContury();
    }
}
