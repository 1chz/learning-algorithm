import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2493 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack();
        for(int i=1;i<=n;i++){
            int [] current = {i, Integer.parseInt(st.nextToken())};
            boolean check = true;
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    if(current[1] > stack.peek()[1]){
                        stack.pop();
                    }else{
                        check = false;
                        System.out.print(stack.peek()[0]+" ");
                        break;
                    }
                }
            }
            if(check){
                System.out.print("0 ");
            }
            stack.push(current);
        }

    }
}
