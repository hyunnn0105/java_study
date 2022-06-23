package datastructure.chap08_grid;
/*
   0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
     <----->          =>   1회
         <--->
   <----------->
             <--->    =>   2회
         <--------->
             <------>
               <------->
                   <------>  =>  3회
                   <--------->
       <------------------------>
                            <-------> => 4회


        주의 ) 2, 2 일 경우 시작하자마자 끝나는 회의이므로 횟수에 추가할 수 있다.
              다만 1, 2가 있을 경우 실제로 2개의 회의가 겹치지 않을 수 있지만
              로직상 1, 2보다 2, 2가 먼저 등장한 경우 나중에 나온 1, 2가 카운팅되지 않는다.
              따라서 종료시간이 같은 경우 시작시간을 먼저 배치하도록 정렬해야 한다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class grid04_Bj1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // 2차원배열
        List<List<Integer>> A = new ArrayList<>();
        /*
        // 2차원 리스트에 데이터 입력받기
        for (int i = 0; i < N; i++) {
            A.add(new ArrayList<>());
            A.get(i).add(sc.nextInt());
            A.get(i).add(sc.nextInt());
        }
         */

        for (int i = 0; i < n; i++) {
            A.add(new ArrayList<Integer>(Arrays.asList(sc.nextInt(), sc.nextInt())));
        }
        sc.close();
        new ArrayList<>(Arrays.asList(A));

        /*
        A.add(new ArrayList<Integer>(Arrays.asList(0, 6)));
        A.add(new ArrayList<Integer>(Arrays.asList(3, 5)));
        A.add(new ArrayList<Integer>(Arrays.asList(1, 4)));
        A.add(new ArrayList<Integer>(Arrays.asList(5, 9)));
        A.add(new ArrayList<Integer>(Arrays.asList(5, 7)));
        A.add(new ArrayList<Integer>(Arrays.asList(3, 8)));
        A.add(new ArrayList<Integer>(Arrays.asList(8, 11)));
        A.add(new ArrayList<Integer>(Arrays.asList(6, 10)));
        A.add(new ArrayList<Integer>(Arrays.asList(2, 13)));
        A.add(new ArrayList<Integer>(Arrays.asList(8, 12)));
        A.add(new ArrayList<Integer>(Arrays.asList(12, 14)));
         */

        // 종료시간 기준정렬
        A.sort((nList1, nList2) -> {
            if (nList1.get(1) == nList2.get(1)) {
                return nList1.get(0) - nList2.get(0);
            }
            return nList1.get(1) - nList2.get(1);
        });
        //

        int endTime = 0;
        int count = 0;
        for (List<Integer> nums : A) {
            if (endTime <= nums.get(0)){
                endTime = nums.get(1);
//                System.out.println(endTime);
                count++;
            }
//            System.out.println(nums.get(0));
//            System.out.println(nums);
        }
        System.out.println(count);

        // 끝나는 시간 오름차정렬

    }
}
