package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2953">
 * https://www.acmicpc.net/problem/2953
 * </a>
 */
public class BOJ_2953 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int highestScore = 0;
        int higher = 0;
        
        for(int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            while(st.hasMoreTokens()) {
                sum += parseInt(st.nextToken());
            }
            if(sum > highestScore) {
                highestScore = sum;
                higher = i;
            }
        }
        
        bw.write(higher + " " + highestScore);
        bw.flush();
        bw.close();
        br.close();
        
    }
    
}



