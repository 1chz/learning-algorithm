package baekjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/17298">
 * https://www.acmicpc.net/problem/17298
 * </a>
 */
public class BOJ_17298 {
    
    public static void main (String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        
        int[] seq = new int[N];
        Stack<Integer> stack = new Stack<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            seq[i] = parseInt(st.nextToken());
        }
        
        for (int i = 0; i < N; i++) {
            while (!stack.empty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }
        
        while (!stack.empty()) {
            seq[stack.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(seq[i])
              .append(" ");
        }
        
        System.out.println(sb);
        br.close();
        
    }
    
}
    



