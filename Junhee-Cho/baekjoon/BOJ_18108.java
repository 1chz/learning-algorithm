package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/18108">
 * https://www.acmicpc.net/problem/18108 1998년생인 내가 태국에서는 2541년생?!
 * </a>
 */
public class BOJ_18108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int DIFF_YEAR = 543;
        final int result = Integer.parseInt(st.nextToken()) - DIFF_YEAR;
        System.out.println(result);
        br.close();
    }
}
