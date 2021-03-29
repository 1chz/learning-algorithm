import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {
    static Stack<int[]> stack = new Stack();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int NGE [] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n;i++){
            int number [] = {i, Integer.parseInt(st.nextToken())};
            if(!stack.isEmpty() && stack.peek()[1] < number[1]){
                int[] temp = stack.pop();
                NGE[temp[0]] = number[1];
                while(!stack.isEmpty()){
                    if(!stack.isEmpty() && stack.peek()[1] < number[1]){
                        temp = stack.pop();
                        NGE[temp[0]] = number[1];
                    }else{
                        break;
                    }
                }
                stack.push(number);
            }else{
                stack.push(number);
            }
        }
        for(int i =0; i<n;i++){
            if(NGE[i] != 0){
                sb.append(NGE[i]+" ");
            }else{
                sb.append(-1+" ");
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
