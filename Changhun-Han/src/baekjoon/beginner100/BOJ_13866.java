package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
import static java.util.Arrays.sort;

/**
 * @see <a href="https://www.acmicpc.net/problem/13866">
 * https://www.acmicpc.net/problem/13866
 * </a>
 */
public class BOJ_13866 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] skills = new int[4];
        for (int i = 0; i < 4; i++) {
            skills[i] = parseInt(st.nextToken());
        }
        sort(skills);
        
        System.out.print(abs((skills[0] + skills[3]) - (skills[1] + skills[2])));
        br.close();
    }
    
}