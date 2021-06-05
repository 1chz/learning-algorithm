package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1343">
 * https://www.acmicpc.net/problem/1343
 * </a>
 */
public class BOJ_1343 {
    
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine()
                         .replaceAll("X{4}", "AAAA")
                         .replaceAll("X{2}", "BB");
            
            if(s.contains("X")) {
                System.out.print(-1);
            }
            else {
                System.out.print(s);
            }
        }
    }
    
}