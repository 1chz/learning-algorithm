package baekjoon;

public class BOJ_15596 {
}

class Test {
    public static long sum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
