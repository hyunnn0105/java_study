package JavaStudyDate.day16.api.obj;

public class Count {
    int n;
    // 생성자
    public Count(int n) {
        System.out.println(n + "번쨰 객체 생성!");
        this.n = n;
        // But 연결한 후에 남ㅡㄴ건 삭제
    }

    // 이제 안쓰임
    @Override
    protected void finalize() throws Throwable {
        System.out.println(n + "번째 객체 삭제");
    }
}
