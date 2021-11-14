package src.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10828">
 * https://www.acmicpc.net/problem/10828
 * </a>
 */
public class BOJ_10828 {
    
    public static void main (String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        
        while (N >= 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            if ("push".equals(command)) {
                stack.push(parseInt(st.nextToken()));
            }
            else if ("size".equals(command)) {
                System.out.println(stack.size());
            }
            else if ("empty".equals(command)) {
                if (stack.empty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if ("pop".equals(command)) {
                if (stack.empty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            }
            else if ("top".equals(command)) {
                if (stack.empty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.peek());
                }
            }
            N--;
        }
        br.close();
    }
    
}
