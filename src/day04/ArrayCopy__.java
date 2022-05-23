package day04;

import java.util.Arrays;

public class ArrayCopy__ {
    
    public static void main(String[] args) {
        //배열복사알고리즘
//        String[] pets = {"멍멍이", "짹짹이", "삐약이"};
//
//        // 변수값을 이동 - 주소 복사함 XXX
//        String[] petsCopy = pets;
//        // 하지만 값을 변수에서 불러온거라 완전한 copy XXX
//        pets[1] = "야옹이";
//        petsCopy[0] = "어흥이";
//
//        System.out.println("원본배열 : " + Arrays.toString(pets));
//        System.out.println("사본배열 : " + Arrays.toString(petsCopy));

        //**배열복사알고리즘**
        String[] pets = {"멍멍이", "짹짹이", "삐약이"};

        // 1. 원본배열과 사이즈가 같은 새 배열을 하나 더 생성 (방하나새로파기)
        String[] petsCopy = new String[pets.length];
        
        // 2. 원본배열에 저장된 값들을 하나하나씩 사본배열로 복사 (옮기기)

        // fori + enter = 함수
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        pets[1] = "야옹이";
        petsCopy[0] = "어흥이";

        System.out.println("원본배열주소 : " + pets);
        System.out.println("원본배열주소 : " + petsCopy);

        System.out.println("원본배열 : " + Arrays.toString(pets));
        System.out.println("사본배열 : " + Arrays.toString(petsCopy));
    }
}
