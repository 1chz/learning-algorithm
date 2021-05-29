package baekjoon.bronze100.d;

import java.io.*;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/10817">
 * https://www.acmicpc.net/problem/10817
 * </a>
 */
public class BOJ_10817 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] list = Arrays.asList(br.readLine().split(" "))
                           .stream()
                           .mapToInt(Integer :: parseInt)
                           .sorted()
                           .toArray();
        
        bw.write(list[1] + "");
        bw.flush();
        bw.close();
        br.close();
    }
    
}