package baekjoon.stack;

import java.io.*;
import java.util.Stack;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1874">
 * https://www.acmicpc.net/problem/1874
 * </a>
 */
public class BOJ_1874 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    
        Stack<Integer> stack = new Stack<>();
    
        int N = parseInt(br.readLine());
        int pre = 0;
        while(N-- > 0) {
            int value = parseInt(br.readLine());
            if(pre < value) {
                for(int i = pre + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                pre = value;
            }
            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}
    


