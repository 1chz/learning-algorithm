package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @apiNote 차량기지 알고리즘 : 중위 표기식을 후위 표기식으로 바꾸는 알고리즘
 * </a>
 * @see <a href="https://www.acmicpc.net/problem/1918">
 * https://www.acmicpc.net/problem/1918
 */
public class BOJ_1918 {
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String s = br.readLine();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).matches("^[A-Z]*$")) {
                sb.append(s.charAt(i));
            }
            else if ("(".equals(s.substring(i, i + 1))) {
                stack.push(s.substring(i, i + 1));
            }
            
            else if (")".equals(s.substring(i, i + 1))) {
                while (!"(".equals(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.empty()
                       &&
                       isPredicate(stack.peek()) <= isPredicate(s.substring(i, i + 1))) {
                    sb.append(stack.pop());
                }
                stack.push(s.substring(i, i + 1));
            }
        }
        
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        
        System.out.println(sb);
        br.close();
        
    }
    
    static int isPredicate (String s) {
        if ("(".equals(s)) {
            return 2;
        }
        if ("+".equals(s) || "-".equals(s)) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
    


