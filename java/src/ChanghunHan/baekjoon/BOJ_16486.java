package ChanghunHan.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/16486">
 * https://www.acmicpc.net/problem/16486
 * </a>
 */
public class BOJ_16486 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double pi = 3.141592;
        int d1 = parseInt(br.readLine());
        int d2 = parseInt(br.readLine());
        System.out.println(( d1 * 2 ) + ( 2 * pi * d2 ));
        br.close();
    }
    
}