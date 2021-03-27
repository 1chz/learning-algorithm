import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        for(int i =0;i<n;i++){
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0){
                stack.pop();
            }else{
                stack.push(temp);
            }
        }
        int total = 0;
        while(stack.size()>0){
            total +=stack.pop();
        }
        System.out.println(total);
    }
}
