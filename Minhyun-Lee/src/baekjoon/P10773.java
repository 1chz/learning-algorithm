package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @see <a href="boj.kr/10773">제로</a>
 */
public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        int number;

        for (int i = 0; i < k; i++) {
            number = Integer.parseInt(br.readLine());

            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        long sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}