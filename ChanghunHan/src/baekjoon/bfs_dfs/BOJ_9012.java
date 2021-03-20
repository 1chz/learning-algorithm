package baekjoon.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/9012">
 * https://www.acmicpc.net/problem/9012
 * </a>
 */
public class BOJ_9012 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            System.out.println(calc(input));
        }
        br.close();
    }
    
    public static String calc (String input) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == '(') {
                stack.push('(');
            }
            else {
                if (stack.empty()) {
                    return "NO";
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
    
}




