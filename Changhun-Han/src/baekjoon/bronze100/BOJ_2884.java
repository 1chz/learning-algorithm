package baekjoon.bronze100;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2884">
 * https://www.acmicpc.net/problem/2884
 * </a>
 */
public class BOJ_2884 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        
        LocalTime time = LocalTime.of(H, M)
                                  .minusMinutes(45);
        
        String result = DateTimeFormatter.ofPattern("H m")
                                         .format(time);
        
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
    
}