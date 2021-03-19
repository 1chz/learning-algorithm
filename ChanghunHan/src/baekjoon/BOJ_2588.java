package baekjoon;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2588">
 * https://www.acmicpc.net/problem/2588
 * </a>
 */
public class BOJ_2588 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = parseInt(br.readLine());
        int B = parseInt(br.readLine());
        
        StringBuilder builder = new StringBuilder();
        builder.append(A * ( B % 10 ))
               .append("\n")
               .append(A * ( B % 100 / 10 ))
               .append("\n")
               .append(A * ( B / 100 ))
               .append("\n")
               .append(A * B);
        System.out.println(builder);
        br.close();
    }
    
}