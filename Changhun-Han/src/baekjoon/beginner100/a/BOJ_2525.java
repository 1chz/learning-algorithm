package src.baekjoon.beginner100.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2525">
 * https://www.acmicpc.net/problem/2525
 * </a>
 */
public class BOJ_2525 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = parseInt(st.nextToken());
        int minute = parseInt(st.nextToken());
        int plusMinute = parseInt(br.readLine());
        LocalTime time = LocalTime.of(hour, minute).plusMinutes(plusMinute);
        System.out.println(DateTimeFormatter.ofPattern("H m").format(time));
        br.close();
    }
    
}
