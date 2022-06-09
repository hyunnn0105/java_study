package JavaStudyDate.day04;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        // 배열데이터 추가 알고리즘
        int[] arr = {10,20,30};
        int newData = 40; // 3번 index자리에 추가

        // 1. 원본 배열보다 사이즈가 1큰 새로운 배열 생성
        int[] temp = new int[arr.length+1]; // 기존방에 +1

        // 2. 원본배열의 데이터(원본배열 길이사용)를 새로운 배열에 복사 - 복사알고리즘
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];

        }
        // 3. 추가할 데이터를 마지막 인덱스에 추가한다 - 데이터는 temp애 저장됨
        // but 원하는건 원본배열에 추가되는것
        temp[temp.length-1] = newData;

        // 4. 주소값 이전
        // 4-1. arr에 temp 주소값 넣어주기
        // 4-2. 오류 제거를 위해 temp 비우기
        arr = temp;
        temp = null;

        System.out.println("원본배열: " + Arrays.toString(arr));
        System.out.println("새로운배열: " + Arrays.toString(temp));

    }
}
