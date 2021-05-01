package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/11382">
 * https://www.acmicpc.net/problem/11382 꼬마 정민
 * </a>
 */
public class BOJ_11382 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String DELIMITER = " ";
        final long[] arr = Arrays.stream(br.readLine().split(DELIMITER)).mapToLong(Long::parseLong).toArray();
        System.out.println(Arrays.stream(arr).sum());
        br.close();
    }
}
