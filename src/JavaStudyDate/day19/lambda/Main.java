package JavaStudyDate.day19.lambda;

import Utility.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static JavaStudyDate.day19.lambda.Apple.Color;
import static JavaStudyDate.day19.lambda.Book.Genre.*;
import static JavaStudyDate.day19.lambda.FilteringApple.*;

public class Main {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, Color.GREEN));
        inventory.add(new Apple(40, Color.RED));
        inventory.add(new Apple(140, Color.RED));
        inventory.add(new Apple(120, Color.RED));
        inventory.add(new Apple(70, Color.GREEN));
        inventory.add(new Apple(30, Color.GREEN));

        // 녹색사과들만 필터링
        List<Apple> greens = filterGreenApples(inventory);
        for (Apple gr : greens) {
            System.out.println(gr);
        }

        Util.line();

        List<Apple> filterColor = filterApplesByColor(inventory, Color.RED);
        for (Apple Filter : filterColor ) {
            System.out.println(Filter);
        }

        Util.line();
        
        // 무게가 큰 사과들만 필터링
        System.out.println("무게가 100 이상인 사과들만 필터링");
        for (Apple ha : filterList(inventory, new AppleweightPredicate())) {
            System.out.println(ha);
        }


        Util.line();
        // solution c ---> filterApples

        System.out.println(" 100그람 아래 사과");

        System.out.println("빨강색이면서 100그람 아래");

        /*
        List<Apple> filteredList = filterList(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == Color.RED && apple.getWeight() >= 100;
            }
        });
        for (Apple apple : filteredList) {
            System.out.println(apple);
        }

         */
        Util.line();
        // a를 전달하면 하나가 온다
        List<Apple> filteredList2 = filterList(inventory, a -> a.getColor()
                == Color.RED && a.getWeight() >= 100);

        for (Apple apple : filteredList2) {
            System.out.println(apple);
        }

        Util.line();

        List<Book> bookList = new ArrayList<>();
        bookList.addAll(
                Arrays.asList(
                        new Book(10000, HISTORY),
                        new Book(12000, COMICS),
                        new Book(14000, BIBLE),
                        new Book(16000, HISTORY)
                )
        );

        List<Book> filteredBooks
                = filter(bookList, b -> b.getGenre() == COMICS);


        for (Book fb : filteredBooks) {
            System.out.println(fb);
        }

        Util.line();
        // 정수 리스트
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // 홀수만 필터링
        List<Integer> integers = filter(numbers, n -> n % 3 == 0);
        for (Integer n : integers) {
            System.out.println(n);
        }


    }
}
