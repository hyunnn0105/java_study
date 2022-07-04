#### 람다 규칙에 맞지 않는 표현식은?
 소괄호+중괄호
1. `(파라미터) -> {메서드 내부식}`
2. `() -> (return) "Raoul"`
3. `() -> { return "Mario" }` - 리턴쓸거면 중괄호도 쓰기
 // 매개변수 타입 써도되고 안써도됨
4. `(Integer i) -> return "Alan" + i`
-> `(Integer i) -> "Alan" + i`
5. `(String s) -> { "Iron Man" }`
-> `(String s) -> { return "Iron Man" }`
---
정답: 4, 5