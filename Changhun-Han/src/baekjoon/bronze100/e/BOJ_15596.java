package src.baekjoon.bronze100.e;

/**
 * @see <a href="https://www.acmicpc.net/problem/15596">
 * https://www.acmicpc.net/problem/15596
 * </a>
 */
public class BOJ_15596 {

    long sum (int[] a) {
        long ans = 0;
        for(long element : a) {
            ans += element;
        }
        return ans;
    }

}
