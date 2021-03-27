import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true){
            Stack stack = new Stack();
            line = br.readLine();
            if(line.equals(".")){
                break;
            }
            for(int i =0; i<line.length(); i++){
                if(line.charAt(i) == '('){
                    stack.push('(');
                }
                else if(line.charAt(i) == '['){
                    stack.push('[');
                }
                else if(line.charAt(i) == ')'){
                    if(!stack.isEmpty() && (char) stack.peek() == '('){
                        stack.pop();
                    }else{
                        stack.push(')');
                        break;
                    }
                }
                else if(line.charAt(i) == ']'){
                    if(!stack.isEmpty() && (char) stack.peek() == '['){
                        stack.pop();
                    }else{
                        stack.push(']');
                        break;
                    }
                }
                else{
                    continue;
                }
            }
            if(stack.isEmpty()){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
        System.out.println(sb.toString());
    }
}
