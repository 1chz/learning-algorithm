package src.baekjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @see <a href="https://www.acmicpc.net/problem/10799">
 * https://www.acmicpc.net/problem/10799
 * </a>
 */
public class BOJ_10799 {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Integer> stack = new Stack<>();

        int bar = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            else {
                if (stack.peek() == i - 1) {
                    stack.pop();
                    bar += stack.size();
                }
                else {
                    stack.pop();
                    bar++;
                }
            }
        }
        System.out.println(bar);
        br.close();
    }

}



