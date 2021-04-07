package baekjoon.bronze100;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10757">
 * https://www.acmicpc.net/problem/10757
 * </a>
 */
public class BOJ_10757 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        
        bw.write(A.add(B).toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}