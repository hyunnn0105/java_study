package JavaStudyDate.day15.exception;

public class FinallyExample {
    public static void main(String[] args) {
        // 원래는 코드 들어가는 자리!
        String[] pets = {"비둘기", "거북이", "짹짹이"};
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + "키울래");
            } catch (Exception e) {
                System.out.println("애완동물 정보 존재X");
            } finally {
                // 예외가 발생하지 않아도 무조건 실행할 코드
                System.out.println("애완동물 조아요\n");

                // 메모리 누수 방지 코드를 보통 finally에 작성함
                // ex ) database 연결코드, 네트워크 연결코드, 하드웨어 장치 연결 코드...
            }
        }
        System.out.println("정상종료");
        
    }
}
