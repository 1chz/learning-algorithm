package src.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10773">
 * https://www.acmicpc.net/problem/10773
 * </a>
 */
public class BOJ_10773 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int money = parseInt(br.readLine());
            if (money == 0) {
                stack.pop();
            }
            else {
                stack.push(money);
            }
        }

        long sum = 0;
        while (stack.size() > 0) {
            sum += stack.pop();
        }
        System.out.println(sum);
        br.close();
    }

}
