package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class BOJ_1874 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stacks = new Stack();

        for (int j =0; j<n;j++){
            int x = Integer.parseInt(br.readLine());
            for (int i =1; i<=x;i++) {
                if (stacks.peek() < x) {
                    sb.append("+\n");
                    stacks.push(i);
                } else if (stacks.peek() == x) {
                    stacks.pop();
                    sb.append("-\n");
                    i--;
                    continue;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
        }
        System.out.println(sb.toString());

    }
}
