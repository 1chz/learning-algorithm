package baekjoon.bronze100.e;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/13277">
 * https://www.acmicpc.net/problem/13277
 * </a>
 */
public class BOJ_13277 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String result = new BigInteger(st.nextToken())
                .multiply(new BigInteger(st.nextToken()))
                .toString();

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

}