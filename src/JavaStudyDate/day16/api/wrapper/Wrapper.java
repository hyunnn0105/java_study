package JavaStudyDate.day16.api.wrapper;

public class Wrapper {
    // integer 초기값 null
    // int 초기값 0
    public static void main(String[] args) {
        Object[] arr = {10,20,30};

        //인트+문자열 한번에 리턴
        Integer n = 10; // 오토 박싱
        String s = "zz";
//        int m = n.intValue();
        int m = n; // 오토 언박싱
        
        System.out.println(Integer.MAX_VALUE);
    }
}
