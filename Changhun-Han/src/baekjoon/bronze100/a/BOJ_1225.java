package baekjoon.bronze100.a;

import java.io.*;
import java.util.Arrays;

import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1225">
 * https://www.acmicpc.net/problem/1225
 * </a>
 */
public class BOJ_1225 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split(" ");

        int A = Arrays.stream(strings[0].split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        int B = Arrays.stream(strings[1].split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        bw.write(valueOf(A * B));
        bw.flush();
        bw.close();
        br.close();
    }

}