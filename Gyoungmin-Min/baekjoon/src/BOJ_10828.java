import java.io.BufferedReader;
 import java.io.BufferedWriter;
 import java.io.InputStreamReader;
 import java.io.OutputStreamWriter;
 import java.util.Scanner;
 import java.util.StringTokenizer;

public class BOJ_10828 {
    static int []stack = new int[10000];
    static int index =1;
    static StringBuilder sb = new StringBuilder();
    public static void push(int x){
        stack[index] = x;
        index++;
    }
    public static void pop(){
        int x;
        if (stack[index-1]== 0){
            sb.append("-1\n");
        }else{
            x = stack[index-1];
            stack[index-1] = 0;
            index--;
            sb.append(x+"\n");
        }
    }
    public static void size()
    {   sb.append(index-1+"\n");
    }
    public static void empty(){
        if (index == 1){
            sb.append("1\n");
        }else{
            sb.append("0\n");
        }
    }
    public static void top(){
        int x;
        if (stack[index-1] == 0){
            sb.append("-1\n");
        }else{
            x = stack[index-1];
            sb.append(x+"\n");
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i =0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "top":
                    top();
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }
        System.out.println(sb.toString());
        /*br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();*/
    }
}

