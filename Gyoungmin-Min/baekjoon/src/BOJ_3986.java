import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_3986 {
    static int total = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int test_case =0; test_case<n;test_case++){
            String words = br.readLine();
            Stack stack = new Stack();
            for(int i =0; i<words.length(); i++){
                if(!stack.isEmpty() && words.charAt(i) == (char) stack.peek()){
                    stack.pop();
                }else{
                    stack.push(words.charAt(i));
                }
            }
            if(stack.isEmpty()){
                total++;
            }
        }
        System.out.println(total);
    }
}
