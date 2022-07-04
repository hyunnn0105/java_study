
- 여러가지 람다 표현식
    1. `(String s) -> s.length()` : String형식의 파라미터 하나를 가지며 int를 반환한다. 람다표현식에는 return이 함축되어 있다.
    1. `(Apple a) -> a.getWeight() > 150` : Apple형식의 파라미터 하나를 가지며 boolean을 반환한다.
    1. int형식의 2개의 파라미터를 가지며 리턴값이 없다.
        ```
       // return값 X -> void
             (int x, int y) -> {
                 System.out.println("Result:");
                 System.out.println(x + y);
             }
        ```
    1. `() -> 42` : 파라미터가 없으며 42를 반환한다.

- 제공되는 함수형 인터페이스

| 함수형 인터페이스           | 함수 디스크립터          |
|---------------------|-------------------|
| Predicate<T>        | T -> boolean      |
| Consumer<T>         | T -> void         |
| Function<T, R>      | T -> R            |
| Supplier<T>         | () -> T           |
| UnaryOperator<T>    | T -> T            |
| BinaryOperator<T>   | (T, T) -> T       |
| BiPredicate<L, R>   | (T, U) -> boolean |
| BiConsumer<T, U>    | (T, U) -> void    |
| BiFunction<T, U, R> | (T, U) -> R       |

- 메서드 참조 : 람다를 더 줄임
    - `(args) -> ClassName.staticMethod(args)` => `ClassName::staticMethod`
        - `() -> Math.random()` => `Math::random`
        - `message -> System.out.println(message)` => `System.out::println`

    // 두개전달(무조건 객체,아무거나)   
    참조변수이름::인스턴스이름?   

    - `(args0, rest) -> args0.instanceMethod(rest)` => `ClassName::instanceMethod`
        - `(str, i) -> str.substring(i)` => `String::substring`
        - `(apple) -> apple.getWeight()` => `Apple::getWeight`
    - `(args) -> expr.instanceMethod(args)` => `expr::instanceMethod`
        - `(s) -> this.isValidName(s)` => `this::isValidName`

- 생성자 참조
    - `() -> new Constructor()` => `ClassName::new`
        - `() -> new Apple()`  => `Apple::new`
    - `(args) -> new Constructor(args)` => `ClassName::new`
        - `(weight) -> new Apple(weight)` => `Apple::new`