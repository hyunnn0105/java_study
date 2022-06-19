package Homework.day0619.lamdaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lamdaTest2 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
                Arrays.asList("cat", "hippo", "a", "giraffe", "elephant", "monkey", "")
        );

//        AnimalPredicate animalPredicate = new AnimalPredicate();
        // 리무브 로직 넣어주기
//        animals.removeIf(animalPredicate);

        System.out.println(animals);
    }

    /*
    static class AnimalPredicate implements Predicate<String> {

        @Override
        public boolean test(String s) {
            return s.length() < 2;
        }
    }

     */
}
