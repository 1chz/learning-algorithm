package baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/18258">
 * https://www.acmicpc.net/problem/18258
 * </a>
 */
public class BOJ_18258 {
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = parseInt(br.readLine());
        
        LinkedList q = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();
        
        while(0 < N--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if("push".equals(s)) {
                q.add(parseInt(st.nextToken()));
            }
            else if("pop".equals(s)) {
                if(q.isEmpty()) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(q.poll() + "\n");
                }
            }
            else if("size".equals(s)) {
                sb.append(q.size() + "\n");
            }
            else if("empty".equals(s)) {
                if(q.isEmpty()) {
                    sb.append(1 + "\n");
                }
                else {
                    sb.append(0 + "\n");
                }
            }
            else if("front".equals(s)) {
                if(q.isEmpty()) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(q.peekFirst() + "\n");
                }
            }
            else if("back".equals(s)) {
                if(q.isEmpty()) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(q.peekLast() + "\n");
                }
            }
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}