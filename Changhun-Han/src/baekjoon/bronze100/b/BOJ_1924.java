package baekjoon.bronze100.b;

import java.io.*;
import java.time.LocalDate;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1924">
 * https://www.acmicpc.net/problem/1924
 * </a>
 */
public class BOJ_1924 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mon = parseInt(st.nextToken());
        int day = parseInt(st.nextToken());
        
        LocalDate date = LocalDate.of(2007, mon, day);
        
        bw.write(date.getDayOfWeek().toString().substring(0, 3));
        bw.flush();
        bw.close();
        br.close();
    }
    
}