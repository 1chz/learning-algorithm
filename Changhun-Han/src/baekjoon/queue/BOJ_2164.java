package baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2164">
 * https://www.acmicpc.net/problem/2164
 * </a>
 */
public class BOJ_2164 {
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Queue<Integer> queue = new LinkedList<>();
        int N = parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }
        
        while(queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        
        bw.write(queue.poll().toString());
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}