import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stacks = new Stack();
        stacks.push(1);
        sb.append("+\n");
        boolean check = false;
        int start = 2;
        for (int j =0; j<n;j++){
            int x = Integer.parseInt(br.readLine());
            if (!stacks.isEmpty() && stacks.peek() == x) {
                stacks.pop();
                sb.append("-\n");
                continue;
            }
            else if (!stacks.isEmpty() && stacks.peek() > x) {
                check = true;
                break;
            }
            else {
                for (int i = start; i<=x;i++) {
                    sb.append("+\n");
                    stacks.push(i);
                    start++;
                }
                if (!stacks.isEmpty() && stacks.peek() == x) {
                    stacks.pop();
                    sb.append("-\n");
                }
            }
        }
        if(check){
            System.out.println("NO");
        }else{
            System.out.println(sb.toString());
        }
    }
}
