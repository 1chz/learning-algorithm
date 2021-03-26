package baekjoon.queue;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10845">
 * https://www.acmicpc.net/problem/10845
 * </a>
 */
public class BOJ_10845 {
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Queue<Integer> queue = new LinkedList<>();
        int iNum = 0;
        int N = parseInt(br.readLine());
        
        while (0 < N--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if ("push".equals(s)) {
                iNum = parseInt(st.nextToken());
                queue.add(iNum);
            }
            else if ("pop".equals(s)) {
                bw.write((queue.isEmpty() ? -1 : queue.poll()) + "\n");
            }
            else if ("size".equals(s)) {
                bw.write((queue.size()) + "\n");
            }
            else if ("empty".equals(s)) {
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            }
            else if ("front".equals(s)) {
                bw.write((queue.isEmpty() ? -1 : queue.peek()) + "\n");
            }
            else if ("back".equals(s)) {
                bw.write((queue.isEmpty() ? -1 : iNum) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
    
}