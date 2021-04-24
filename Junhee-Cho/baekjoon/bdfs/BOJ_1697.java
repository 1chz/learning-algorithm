package baekjoon.bdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @see <a href="https://www.acmicpc.net/problem/1697">
 * https://www.acmicpc.net/problem/1697 숨바꼭질
 * </a>
 */

/*
5 17

4
 */
public class BOJ_1697 {
    private static String DELIMITER = " ";

    private static int[] getInput() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int[] NK = Arrays.stream(br.readLine().split(DELIMITER))
                .mapToInt(Integer::parseInt)
                .toArray();

        br.close();
        return NK;
    }

    public static void main(String[] args) throws IOException {
        final int[] NK = getInput();
        final int result = new Solution1697().result(NK);
        System.out.println(result);
    }
}

class Solution1697{
    int result(final int[] NK){
        final int n = NK[0];
        final int k = NK[1];
        final int[] check = new int[100001];
        if(n > k) return n - k;
        if(n == k) return 0;
        return bfs( n, k, check);
    }

    private int bfs(final int n, final int k, final int[] check) {
        Queue<Integer> queue = new LinkedList();
        queue.offer(n);
        check[n] = 1;

        while(!queue.isEmpty()){
            final int current = queue.poll();

            final int[] arr = {current - 1, current + 1, current * 2};

            for (final int next : arr) {
                if (next == k) {
                    return check[current];
                }

                if (nextIsMovable(check, next)) {
                    queue.offer(next);
                    check[next] = check[current] + 1;
                }
            }
        }
        return -1;
    }

    private boolean nextIsMovable(int[] check, int next) {
        return next >= 0 && next < check.length && check[next] == 0;
    }

}
