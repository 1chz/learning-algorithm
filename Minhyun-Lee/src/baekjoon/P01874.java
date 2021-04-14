package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @see <a href="boj.kr/1874">스택 수열</a>
 */
public class P01874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int number;
        int curNumber = 1;

        stack.push(0);
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(br.readLine());

            while (stack.peek() != number) {
                if (stack.peek() > number) {
                    System.out.println("NO");
                    return;
                }

                if (stack.peek() < number) {
                    stack.push(curNumber);
                    sb.append("+\n");
                    curNumber++;
                }
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb);
    }
}