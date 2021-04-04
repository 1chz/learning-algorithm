package baekjoon.bronze100;

import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10818">
 * https://www.acmicpc.net/problem/10818
 * </a>
 */
public class BOJ_10818 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 필요없음
        parseInt(br.readLine());
        
        int[] list = Arrays.asList(br.readLine().split(" "))
                           .stream()
                           .mapToInt(Integer :: parseInt)
                           .toArray();
        int min = Arrays.stream(list).min().getAsInt();
        int max = Arrays.stream(list).max().getAsInt();
        
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
    
}