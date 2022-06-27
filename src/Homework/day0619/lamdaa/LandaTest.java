package Homework.day0619.lamdaa;

import java.util.Arrays;

public class LandaTest {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey", ""};

//        AnimalComparator animalComparator = new AnimalComparator();
        /*
                    Arrays.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
         */

        Arrays.sort(animals,(o1, o2) -> o1.length() - o2.length());

        for (String item : animals) {
            System.out.println(item);
        }
    }

    /*
        static class AnimalComparator implements Comparator<String>{

        //펑셔널인터페이스활용 함수형 인터페이스 구현

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }

    }
     */



}
