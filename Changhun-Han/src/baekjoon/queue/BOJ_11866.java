package baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/11866">
 * https://www.acmicpc.net/problem/11866
 * </a>
 */
public class BOJ_11866 {
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int K = parseInt(st.nextToken());
        
        LinkedList q = new LinkedList();
        
        for(int i = 1; i <= N; i++) {
            q.add(i);
        }
        
        StringBuilder sb = new StringBuilder("<");
        
        while(q.size() != 1) {
            for(int i = 0; i < K - 1; i++) {
                q.add(q.poll());
            }
            sb.append(q.poll() + ", ");
        }
        
        sb.append(q.poll() + ">");
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}