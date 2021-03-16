package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10797">
 * https://www.acmicpc.net/problem/10797
 * </a>
 */
public class BOJ_10797 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer cars;
        int count = 0;
        int day = parseInt(br.readLine());
        cars = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 5; i++) {
            if (day == parseInt(cars.nextToken())) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
    
}