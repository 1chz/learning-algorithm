package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1918 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        Stack<Object []> stack = new Stack();
        Stack<Object []> stack2 = new Stack();
        Stack<Object []> stack3 = new Stack();
        int count =0;
        int max_count =0;
        for(int i =0; i<words.length(); i++){
            if(words.charAt(i) == '+' || words.charAt(i) == '-'){
                Object [] temp = { count, words.charAt(i)};
                stack2.push(temp);
                Object [] temp2 = { count, words.charAt(i+1)};
                stack.push(temp2);
                i++;
            }
            else if(words.charAt(i) == '/' || words.charAt(i) == '*'){
                Object [] temp = { count+1, words.charAt(i)};
                stack3.push(temp);
                Object [] temp2 = { count+1, words.charAt(i+1)};
                stack.push(temp2);
                i++;
            }
            else if(words.charAt(i) == '('){
                count++;
                max_count++;
            }
            else if(words.charAt(i) == ')'){
                count--;
            }

            else{
                Object [] temp = { count, words.charAt(i)};
                stack.push(temp);
            }
        }
        Stack<Object []> temp_stack = new Stack();
        Stack<Object []> temp_stack2 = new Stack();
        Stack<Object []> temp_stack3 = new Stack();
        while(!stack.isEmpty()){
            Object [] temp = stack.pop();
            if ((int) temp[0] < max_count){
                temp_stack.push(temp);
            }else{
                sb.append(temp[1]);
            }
            if(stack.isEmpty()){
                while (!stack3.isEmpty()){
                    Object [] temp2 = stack3.pop();
                    if ((int) temp2[0] < max_count){
                        temp_stack3.push(temp2);
                    }else{
                        sb.append(temp2[1]);
                    }
                }
                while(!temp_stack.isEmpty()){
                    stack.push(temp_stack.pop());
                }
                if(stack3.isEmpty()){
                    while (!stack2.isEmpty()){
                        Object [] temp3 = stack2.pop();
                        if ((int) temp3[0] < max_count){
                            temp_stack2.push(temp3);
                        }else{
                            sb.append(temp3[1]);
                        }
                    }
                    while(!temp_stack2.isEmpty()){
                        stack2.push(temp_stack2.pop());
                    }
                    while(!temp_stack3.isEmpty()){
                        stack3.push(temp_stack3.pop());
                    }
                }
                max_count--;
            }
        }
        System.out.println(sb.toString());
    }
}
//A-B+C*D/T
//CDT*/AB-+
//*/ 있을시