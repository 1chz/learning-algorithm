package ChanghunHan.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1001">
 * https://www.acmicpc.net/problem/1001
 * </a>
 */
public class BOJ_1001 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
        br.close();
    }
    
}