## 1. 메인함수/클래스
    public class Comment {
        //함수를 호출해서 실행하려면 main함수가 필요합니다.
        public static void main(String[] args) {

            System.out.println("hello");

        } //end day07object.PhoneFactory.main
    } //end class

- 자바는 클래스라는 블록에서 코드가 시작됨
- 메인 함수는 프로그램의 실행 시작 지점이며 메인 함수 없이 프로그램은 실행되지 않음
 
<br>

## 2. 변수
1. 변수의 선언 (타입지정)
```
int score;
```
2. 변수의 초기화 (값 지정)
```
score = 78;
```
=> 변수의 선언과 초기화를 통해 변수 생성
3. 변수의 값 변경
```
int life = 3;
life = 5;
```
4. 주의사항
```
nickname = 5.5; 변수 타입과 다른값은 저장 불가
double score = 3.3; 같은 범위 안에서 같은 이름 사용X
```
<br>

## 3. 블록레벨스코프
- 변수를 선언한 블록 밖에서 사용불가
- 변수의 선언과 대입을 분할하기
- 블록 밖에서 동일한 이름의 변수 생성가능


```
    int num3;
    
    if (ture) {
      // int num1 = 300; - 하위블럭에서 상위블럭과 이름이 동일한 함수생성불가
      int num3 = num1 + num2;
      System.out.println("num3 = " + num3);
    } //endif
    //System.out.println("num3 = " + num3); - 지역변수라서 블록 밖에서 사용불가
          
    int num4 = num1 + num2;
    int num3 = 300; // 블록 밖에서 동일한 이름의 변수 생성가능
    
```
