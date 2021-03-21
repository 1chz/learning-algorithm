package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/3986">
 * https://www.acmicpc.net/problem/3986
 * </a>
 */
public class BOJ_3986 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;
        int N = parseInt(br.readLine());
        while (0 < N--) {
            String s = br.readLine();
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (stack.empty()) {
                    stack.push(s.substring(i, i + 1));
                }
                else if (stack.peek().equals(s.substring(i, i + 1))) {
                    stack.pop();
                }
                else {
                    stack.push(s.substring(i, i + 1));
                }
            }
            if (stack.empty()) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
    
}
    


