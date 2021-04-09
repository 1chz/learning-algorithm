import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_10845 {
    static StringBuilder sb = new StringBuilder();
    static int queue [];
    static int index = 0;
    static int size = 0;
    static int first = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        queue = new int[n];

        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
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
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    static void push(int x){
        queue[index] = x;
        index++;
        size++;
    }
    static void pop(){
        if(size == 0 ){
            sb.append(-1+"\n");
        }else{
            sb.append(queue[first]+"\n");
            first++;
            size--;
        }
    }
    static void size(){
        sb.append(size+"\n");
    }
    static void empty(){
        if(size == 0 ){
            sb.append(1+"\n");
        }else{
            sb.append(0+"\n");
        }

    }
    static void front(){
        if(size == 0 ){
            sb.append(-1+"\n");
        }else{
            sb.append(queue[first]+"\n"); //
        }
    }
    static void back(){
        if(size == 0 ){
            sb.append(-1+"\n");
        }else{
            sb.append(queue[index-1]+"\n"); //
        }
    }
}
