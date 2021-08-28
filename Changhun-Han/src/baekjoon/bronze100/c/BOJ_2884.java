package baekjoon.bronze100.c;

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
    
    public static void solution1 () throws IOException {
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
    
    public static void solution2 () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        
        M -= 45;
        
        if(M < 0) {
            M += 60;
            H -= 1;
            if(H < 0) {
                H = 23;
            }
        }
        
        bw.write(H + " " + M);
        bw.flush();
        bw.close();
        br.close();
    }
    
}