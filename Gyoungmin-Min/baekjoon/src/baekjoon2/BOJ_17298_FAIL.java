package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {
    static Stack<Integer> stack = new Stack();
    static Stack<Integer> stack2 = new Stack();
    //static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        //sb.append(" 1-");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        Stack<Integer> stack3 = new Stack();
        stack3.push(-1);
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(st.nextToken()));
        }
        while (stack.size() > 0) {
            int x = stack.pop();
            if (!stack.isEmpty() && stack.peek() < x) {
                stack3.push(x);
                //sb.append(" "+x);
            } else {
                Stack<Integer> temp = new Stack();
                boolean check = true;
                while (stack2.size() > 0) {
                    if (stack2.peek() > stack.peek()) {
                        check = false;
                        stack3.push(stack2.pop());
                        //sb.append(" "+stack2.pop());
                        break;
                    } else {
                        temp.push(stack2.pop());
                    }
                }
                if (temp.isEmpty()) {
                    while (temp.size() > 0) {
                        stack2.push(temp.pop());
                    }
                }
                if(!stack.isEmpty() && check){
                    stack3.push(-1);
                    //sb.append(" 1-");
                }
            }
            stack2.push(x);
        }
        while(stack3.size() > 0){
            System.out.print(stack3.pop()+" ");
        }
        //System.out.println(sb.reverse().toString());

    }
}
