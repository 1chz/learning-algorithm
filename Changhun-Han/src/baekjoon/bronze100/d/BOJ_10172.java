package baekjoon.bronze100.d;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/10172">
 * https://www.acmicpc.net/problem/10172
 * </a>
 */
public class BOJ_10172 {
    
    public static void main (String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder("|\\_/|\n")
                .append("|q p|   /}\n")
                .append("( 0 )\"\"\"\\\n")
                .append("|\"^\"`    |\n")
                .append("||_/=\\\\__|");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}


