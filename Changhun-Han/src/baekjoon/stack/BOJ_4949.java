package src.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @see <a href="https://www.acmicpc.net/problem/4949">
 * https://www.acmicpc.net/problem/4949
 * </a>
 */
public class BOJ_4949 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.charAt(0) == '.') {
                break;
            }
            else {
                System.out.println(calc(input));
            }
        }
        br.close();
    }
    
    public static String calc (String input) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == '.') {
                break;
            }
            else if (input.charAt(j) == '(') {
                stack.push('(');
            }
            else if (input.charAt(j) == '[') {
                stack.push('[');
            }
            else if (input.charAt(j) == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if (input.charAt(j) == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
    
}



