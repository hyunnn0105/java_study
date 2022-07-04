#### 다음 코드 실행 결과는 4, 5, 6, 42 중 무엇?

```java
public class MeaningOfThis {

    public final int value = 4;

    public void doIt() {
        int value = 6;
        //익명클래스 소속 -> 익명클래스의 this
        // 내 클래스 안에 속한 필드 5
        Runnable r = new Runnable() {
            public final int value = 5;
            
            @Override
            public void run() {
                int value = 42;
                // this라서 로컬변수 지우기
                // public + 필드만 가능
                System.out.println(this.value);
            }
        };
    }
    
    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}

```


---
정답: 5   
// 내답 > r로 오버라이딩 한 다음에 value값을 설정해서?