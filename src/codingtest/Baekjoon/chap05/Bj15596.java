package codingtest.Baekjoon.chap05;

public class Bj15596 {
        static int[] arr = {10,20,30,40,50,60};
        static long sum(int[] a) {
            long ans = 0;
            for (int i = 0; i < arr.length; i++) {
                ans += arr[i];
            }
            return ans;
        }

    public static void main(String[] args) {
        //int[] arr = {10,20,30,40,50,60};
        long end = sum(arr);
        // System.out.println("end = " + end);
    }
}
/* 
    //제출 어케해야할지 몰라서 좀 해멨당
        import java.util.Arrays;

        public class Test {
                static long sum(int[] a) {
                long ans = 0;
                for (int i = 0; i < a.length; i++) {
                ans += a[i];
                }
                return ans;

            }
        }

 */
