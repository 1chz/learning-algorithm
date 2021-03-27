package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2530">
 * https://www.acmicpc.net/problem/2530
 * </a>
 */
public class BOJ_2530 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());
        int C = parseInt(st.nextToken());
        int D = parseInt(br.readLine());
        LocalTime time = LocalTime.of(A, B, C).plusSeconds(D);
        System.out.println(DateTimeFormatter.ofPattern("H m s").format(time));
        br.close();
    }
    
}