package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2217">
 * https://www.acmicpc.net/problem/2217
 * </a>
 */
public class BOJ_2217 {
    
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            int N = parseInt(br.readLine());
            int result = 0;
            
            List<Integer> ropes = new ArrayList<>();
            
            for(int i = 0; i < N; i++) {
                ropes.add(parseInt(br.readLine()));
            }
            Collections.sort(ropes, Collections.reverseOrder());
            
            for(int i = 0; i < ropes.size(); i++) {
                result = Math.max(result, ropes.get(i) * (i + 1));
            }
            
            System.out.print(result);
        }
    }
    
}