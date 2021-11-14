package src.baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/3078">
 * https://www.acmicpc.net/problem/3078
 * </a>
 */
public class BOJ_3078 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Queue<Integer>[] q = new Queue[21];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int K = parseInt(st.nextToken());
        
        for(int i = 0; i < 21; i++) {
            q[i] = new LinkedList<>();
        }
        
        long count = 0;
        
        for(int i = 0; i < N; i++) {
            int length = br.readLine().length();
            if(!q[length].isEmpty()) {
                while(i - q[length].peek() > K) {
                    q[length].poll();
                    if(q[length].isEmpty()) {
                        break;
                    }
                }
                count += q[length].size();
            }
            q[length].add(i);
        }
        
        bw.write(valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
    
}
