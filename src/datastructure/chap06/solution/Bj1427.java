package datastructure.chap06.solution;

import java.util.Arrays;
import java.util.Scanner;

public class Bj1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
//        int[] arr = new int[num.length()];
//        int N = Integer.parseInt(num);
//        System.out.println(N);
        // 숫자를 한글자씩 빼서 배열에 넣기?
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = Integer.parseInt("" + num.charAt(i));
        }

//        int[] arr = new int[num];
//        int[] arr = {2,1,4,3};
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("입력끝");

        for (int i = 0; i < num.length()-1; i++) {
            int max = i;
            for (int j = i+1; j < num.length(); j++) {
                if (arr[j] > arr[max]){
                    j = max;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
