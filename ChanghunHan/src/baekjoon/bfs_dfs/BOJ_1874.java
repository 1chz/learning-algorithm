package baekjoon.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int N = parseInt(br.readLine());
        int pre = 0;
        while (N-- > 0) {
            int value = parseInt(br.readLine());
            if (pre < value) {
                for (int i = pre + 1; i <= value; i++) {
                    stack.push(i);
                    stringBuilder.append('+').append('\n');
                }
                pre = value;
            }
            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            stringBuilder.append('-').append('\n');
        }
        System.out.println(stringBuilder);
    }
    
}
    


