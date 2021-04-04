package baekjoon.bronze100;

import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10797">
 * https://www.acmicpc.net/problem/10797
 * </a>
 */
public class BOJ_10797 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = parseInt(br.readLine());
        long count = Arrays.asList(br.readLine().split(" "))
                           .stream()
                           .mapToInt(Integer :: parseInt)
                           .filter(o -> o == N)
                           .count();
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
    
}