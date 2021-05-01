package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/17496">
 * https://www.acmicpc.net/problem/17496 스타후르츠
 * </a>
 */
public class BOJ_17496 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int possibleDay = Integer.parseInt(st.nextToken());
        final int growthDay = Integer.parseInt(st.nextToken());
        final int area = Integer.parseInt(st.nextToken());
        final int price = Integer.parseInt(st.nextToken());

        final int harvestCount = (possibleDay - 1) / growthDay;
        int result = harvestCount * area * price;

        System.out.println(result);
        br.close();
    }
}
