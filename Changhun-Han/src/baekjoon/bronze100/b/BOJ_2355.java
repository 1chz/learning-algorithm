package baekjoon.bronze100.b;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Long.parseLong;

/**
 * @see <a href="https://www.acmicpc.net/problem/2355">
 * https://www.acmicpc.net/problem/2355
 * </a>
 */
public class BOJ_2355 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = parseLong(st.nextToken());
        long B = parseLong(st.nextToken());
        long result;

        if (A > B) {
            result = (A + B) * (A - B + 1) / 2;
        } else {
            result = (A + B) * (B - A + 1) / 2;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

}